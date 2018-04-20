package br.com.solimar.desafiostone.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CurrencyQuotation {

    @SerializedName("@odata.context")
    private String data;

    @SerializedName("value")
    private List<CurrencyValue> currencyValueList;

    public CurrencyQuotation(String data) {
        this.data = data;
    }

    public CurrencyQuotation(String data, List<CurrencyValue> currencyValueList) {
        this.data = data;
        this.currencyValueList = currencyValueList;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<CurrencyValue> getCurrencyValueList() {
        return currencyValueList;
    }

    public void setCurrencyValueList(List<CurrencyValue> currencyValueList) {
        this.currencyValueList = currencyValueList;
    }
}
