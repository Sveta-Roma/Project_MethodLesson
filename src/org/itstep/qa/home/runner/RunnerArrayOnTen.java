package org.itstep.qa.home.runner;

import org.itstep.qa.home.array.ArrayOnTen;

import java.util.Arrays;

public class RunnerArrayOnTen {
    public static void main(String[] args) {
        ArrayOnTen arrayOnTen = new ArrayOnTen();

        System.out.println("Увеличенныей массив: ");
        double [] a = arrayOnTen.getArrayIncreaseOnTen(new double[]{10,15});
        System.out.println(Arrays.toString(a));
    }
}
