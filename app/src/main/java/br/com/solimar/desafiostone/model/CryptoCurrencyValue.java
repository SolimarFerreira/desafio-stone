package br.com.solimar.desafiostone.model;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class CryptoCurrencyValue {

    private BigDecimal lowest;
    private BigDecimal volume;
    private int amount;
    private BigDecimal opening;
    private String date;
    private BigDecimal closing;
    private BigDecimal highest;
    private BigDecimal quantity;
    @SerializedName("avg_price")
    private BigDecimal avg_price;


    public CryptoCurrencyValue() {

    }

    public CryptoCurrencyValue(BigDecimal lowest, BigDecimal volume, int amount, BigDecimal avg_price, BigDecimal opening, String date, BigDecimal closing, BigDecimal highest, BigDecimal quantity) {
        this.lowest = lowest;
        this.volume = volume;
        this.amount = amount;
        this.avg_price = avg_price;
        this.opening = opening;
        this.date = date;
        this.closing = closing;
        this.highest = highest;
        this.quantity = quantity;
    }

    public BigDecimal getLowest() {
        return lowest;
    }

    public void setLowest(BigDecimal lowest) {
        this.lowest = lowest;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BigDecimal getAvg_price() {
        return avg_price;
    }

    public void setAvg_price(BigDecimal avg_price) {
        this.avg_price = avg_price;
    }

    public BigDecimal getOpening() {
        return opening;
    }

    public void setOpening(BigDecimal opening) {
        this.opening = opening;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BigDecimal getClosing() {
        return closing;
    }

    public void setClosing(BigDecimal closing) {
        this.closing = closing;
    }

    public BigDecimal getHighest() {
        return highest;
    }

    public void setHighest(BigDecimal highest) {
        this.highest = highest;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
}
