package org.itstep.qa.home.array;

import java.util.Arrays;

public class ArrayOnTen {
    /*Напишите метод, увеличивающий элементы массива на 10%. Определите, какие у этого метода входные и выходные данные.
     Решите сами, должен ли метод изменять исходный массив, или в результате работы будет создаваться новый.
      */

    public double[] getArrayIncreaseOnTen(double [] array){
            for(int i = 0; i < array.length; i++){
                array[i] = array[i] + array[i] *0.1;
            }
        //System.out.println(Arrays.toString(array));
        return array;
        }
    }

