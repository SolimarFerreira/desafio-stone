package br.com.solimar.desafiostone.service;

import br.com.solimar.desafiostone.BuildConfig;
import br.com.solimar.desafiostone.model.CurrencyQuotation;
import br.com.solimar.desafiostone.utils.URL;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

@URL(BuildConfig.API_BANCO_CENRTAL)
public interface IBancoCentralService {

    @GET("CotacaoMoedaDia(moeda=@moeda,dataCotacao=@dataCotacao)")
    Observable<CurrencyQuotation> getSummaryByDate(@Query("@moeda") String currency, @Query("@dataCotacao") String quotationData, @Query("@format") String format);
}
