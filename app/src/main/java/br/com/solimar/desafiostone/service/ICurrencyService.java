package br.com.solimar.desafiostone.service;

import java.util.List;

import br.com.solimar.desafiostone.BuildConfig;
import br.com.solimar.desafiostone.model.Currency;
import br.com.solimar.desafiostone.utils.URL;
import retrofit2.http.GET;
import rx.Observable;

@URL(BuildConfig.API_CURRENCY)
public interface ICurrencyService {

    @GET("currency")
    Observable<List<Currency>> getCryptoCurrencyList();
}
