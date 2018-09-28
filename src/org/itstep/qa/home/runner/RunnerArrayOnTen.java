package org.itstep.qa.home.runner;

import org.itstep.qa.home.array.ArrayOnTen;

public class RunnerArrayOnTen {
    public static void main(String[] args) {
        ArrayOnTen arrayOnTen = new ArrayOnTen();

        System.out.println("Увеличенныей массив: ");
        arrayOnTen.getArrayIncreaseOnTen(new double[]{10,15});
    }
}
