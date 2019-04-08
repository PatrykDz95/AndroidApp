package com.example.cryptoapp.Model;

public class CoinModel {

    public String id;
    public String name;
    public String symbol;
    public String price_usd;
    public String precent_change_1h;
    public String precent_change_24h;
    public String precent_change_7d;


    public CoinModel(){

    }

    public CoinModel(String id, String name, String symbol, String price_usd, String precent_change_1h, String precent_change_24h, String precent_change_7d) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.price_usd = price_usd;
        this.precent_change_1h = precent_change_1h;
        this.precent_change_24h = precent_change_24h;
        this.precent_change_7d = precent_change_7d;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPrice_usd() {
        return price_usd;
    }

    public void setPrice_usd(String price_usd) {
        this.price_usd = price_usd;
    }

    public String getPrecent_change_1h() {
        return precent_change_1h;
    }

    public void setPrecent_change_1h(String precent_change_1h) {
        this.precent_change_1h = precent_change_1h;
    }

    public String getPrecent_change_24h() {
        return precent_change_24h;
    }

    public void setPrecent_change_24h(String precent_change_24h) {
        this.precent_change_24h = precent_change_24h;
    }

    public String getPrecent_change_7d() {
        return precent_change_7d;
    }

    public void setPrecent_change_7d(String precent_change_7d) {
        this.precent_change_7d = precent_change_7d;
    }
}
