package org.itstep.qa.home.runner;

import org.itstep.qa.home.array.Array;

import java.util.Arrays;

public class RunnerArray {
    public static void main(String[] args) {
        Array arrays = new Array();
        //arrays.getArray(new int[]{1, 3, 2, 8, 5, 4});
        System.out.println("Отсортированный массив: ");
        arrays.getSortArray(new int[]{7,4,2,9,5,3,1});
    }
}
