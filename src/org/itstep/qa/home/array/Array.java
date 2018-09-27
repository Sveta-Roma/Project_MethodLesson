package org.itstep.qa.home.array;

import java.util.Arrays;

public class Array {
    //Создать метод, который будет сортировать передаваемый массив по возрастанию и возвращать отсортированный массив.

    /* получить массив
    public void getArray(int [] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
    }
    */

    // получение отсортированного массива
    public void getSortArray(int [] array){
        Arrays.sort(array,0,array.length);
        for(int i = 0; i < array.length; i++){
            //System.out.println(array[i] + " ");
    }
        System.out.println(Arrays.toString(array));
    }
    /*public void getSortArray(int [] array){
        Arrays.sort(array,0,array.length);
        System.out.println("Отсортированный массив: ");
        for (int i:array){
            System.out.println("i = " + i);
        }
    }*/
}
