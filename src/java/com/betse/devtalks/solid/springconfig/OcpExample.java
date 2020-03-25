package com.betse.devtalks.solid.springconfig;

public class OcpExample {

    public String doStuff(String trade) {
        String result = "";

        if (isTradeA()) {
            result += addTradeAString();

        }

        if (isTradeB()) {
            result += addTradeBString();

        }

        return result;

    }

    private boolean isTradeA() {
        return false;
    }

    private String addTradeAString() {
        return null;
    }

    private String addTradeBString() {
        return null;
    }

    private boolean isTradeB() {
        return false;
    }
}
