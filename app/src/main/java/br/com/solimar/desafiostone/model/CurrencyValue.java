package br.com.solimar.desafiostone.model;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class CurrencyValue {

    @SerializedName("paridadeCompra")
    private BigDecimal purchaseParity;

    @SerializedName("paridadeVenda")
    private BigDecimal saleParity;

    @SerializedName("cotacaoCompra")
    private BigDecimal purchaseQuotation;

    @SerializedName("cotacaoVenda")
    private BigDecimal saleQuotation;

    @SerializedName("dataHoraCotacao")
    private String quotationDateTime;

    @SerializedName("tipoBoletim")
    private String bulletinType;


    public CurrencyValue() {
    }

    public CurrencyValue(BigDecimal purchaseParity, BigDecimal saleParity, BigDecimal purchaseQuotation, BigDecimal saleQuotation, String quotationDateTime, String bulletinType) {
        this.purchaseParity = purchaseParity;
        this.saleParity = saleParity;
        this.purchaseQuotation = purchaseQuotation;
        this.saleQuotation = saleQuotation;
        this.quotationDateTime = quotationDateTime;
        this.bulletinType = bulletinType;
    }

    public BigDecimal getPurchaseParity() {
        return purchaseParity;
    }

    public void setPurchaseParity(BigDecimal purchaseParity) {
        this.purchaseParity = purchaseParity;
    }

    public BigDecimal getSaleParity() {
        return saleParity;
    }

    public void setSaleParity(BigDecimal saleParity) {
        this.saleParity = saleParity;
    }

    public BigDecimal getPurchaseQuotation() {
        return purchaseQuotation;
    }

    public void setPurchaseQuotation(BigDecimal purchaseQuotation) {
        this.purchaseQuotation = purchaseQuotation;
    }

    public BigDecimal getSaleQuotation() {
        return saleQuotation;
    }

    public void setSaleQuotation(BigDecimal saleQuotation) {
        this.saleQuotation = saleQuotation;
    }

    public String getQuotationDateTime() {
        return quotationDateTime;
    }

    public void setQuotationDateTime(String quotationDateTime) {
        this.quotationDateTime = quotationDateTime;
    }

    public String getBulletinType() {
        return bulletinType;
    }

    public void setBulletinType(String bulletinType) {
        this.bulletinType = bulletinType;
    }
}