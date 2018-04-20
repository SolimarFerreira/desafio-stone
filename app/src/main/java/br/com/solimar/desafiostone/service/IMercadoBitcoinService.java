package br.com.solimar.desafiostone.service;

import br.com.solimar.desafiostone.BuildConfig;
import br.com.solimar.desafiostone.model.CryptoCurrencyValue;
import br.com.solimar.desafiostone.utils.URL;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

@URL(BuildConfig.API_MERCADO_BITCOIN)
public interface IMercadoBitcoinService {

    @GET("{coin}/day-summary/{year}/{month}/{day}")
    Observable<CryptoCurrencyValue> getDaySummary(@Path("coin") String coin,
                                                  @Path("year") int year,
                                                  @Path("month") int month,
                                                  @Path("day") int day);
}
