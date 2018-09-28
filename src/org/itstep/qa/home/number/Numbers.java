package org.itstep.qa.home.number;

import java.util.Random;

public class Numbers {
    /*Создать метод, который будет принимать два целочисленных параметра a и b,
    будет возвращать случайное целое число из отрезка [a;b].
     */

    public int getRandomNumber(int a, int b) {
        b = b - a;
        int num = (int) (Math.random()*++b) + a;
        return num;
    }
}
