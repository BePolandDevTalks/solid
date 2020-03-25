package com.betse.devtalks.solid.springconfig;

import java.util.List;

public class OcpSolution {

    public String doStuff(String trade, List<XmlCreator> creators) {
        StringBuilder result = new StringBuilder();

        for (XmlCreator c : creators) {
            if (c.check(trade)) {
                result.append(c.getTag());
            }

        }

        return result.toString();
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

    interface XmlCreator {
        boolean check(String trade);

        String getTag();
    }
}
