package org.itstep.qa.home.runner;

import org.itstep.qa.home.money.Currency;

public class RunnerCurrency {
    public static void main(String[] args) {
        Currency currency = new Currency();
        System.out.println("Перевод равен " + currency.toUSD(2,3));
    }

}
