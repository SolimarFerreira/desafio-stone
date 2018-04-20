package br.com.solimar.desafiostone.model;

import java.math.BigDecimal;

public class Currency {

    private int id;
    private String name;
    private String abreviation;
    private String logo;
    private BigDecimal usdBallance;
    private BigDecimal btcBallance;
    private BigDecimal amount;

    public Currency() {
    }

    public Currency(int id, String name, String abreviation, String logo) {
        this.id = id;
        this.name = name;
        this.abreviation = abreviation;
        this.logo = logo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public BigDecimal getUsdBallance() {
        return usdBallance;
    }

    public void setUsdBallance(BigDecimal usdBallance) {
        this.usdBallance = usdBallance;
    }

    public BigDecimal getBtcBallance() {
        return btcBallance;
    }

    public void setBtcBallance(BigDecimal btcBallance) {
        this.btcBallance = btcBallance;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal calcValueInBTC(BigDecimal btcValue, BigDecimal currencyValue){
        return currencyValue.divide(btcValue);
    }
}
