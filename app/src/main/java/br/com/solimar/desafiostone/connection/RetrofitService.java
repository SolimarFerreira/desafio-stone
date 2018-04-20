package br.com.solimar.desafiostone.connection;

import android.support.annotation.NonNull;

import java.lang.annotation.Annotation;
import java.util.concurrent.TimeUnit;

import br.com.solimar.desafiostone.utils.URL;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {

    private static final int TIMEOUT = 30;

    public static OkHttpClient getClient(int timeout) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return new OkHttpClient.Builder()
                .connectTimeout(timeout, TimeUnit.SECONDS)
                .readTimeout(timeout, TimeUnit.SECONDS)
                .addInterceptor(interceptor)
                .build();
    }


    public static <T> T createRetrofitService(final Class<T> clazz) {
        Retrofit retrofit = getRetrofit(loadUrlFromServiceAnnotation(clazz));

        return retrofit.create(clazz);
    }

    @NonNull
    private static <T> String loadUrlFromServiceAnnotation(Class<T> clazz) {
        Annotation[] annotations = clazz.getAnnotations();

        String url = "";

        for (Annotation a : annotations) {
            if (a instanceof URL) {
                url = ((URL) a).value();
                break;
            }
        }
        return url;
    }

    @NonNull
    private static Retrofit getRetrofit(String url) {
        OkHttpClient okHttpClient = getClient(TIMEOUT);

        return new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient)
                .build();
    }
}
