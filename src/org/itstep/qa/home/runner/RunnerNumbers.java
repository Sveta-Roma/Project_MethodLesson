package org.itstep.qa.home.runner;

import org.itstep.qa.home.number.Numbers;

public class RunnerNumbers {
    public static void main(String[] args) {
        Numbers number = new Numbers();
        System.out.println("Случайное число " + number.getRandomNumber(10,18));
    }
}
