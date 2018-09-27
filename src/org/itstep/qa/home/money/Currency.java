package org.itstep.qa.home.money;

public class Currency {
    /*Создайте класс, в нем напишите метод, toUSD(int byn, double course), переводящий рубли в доллары по заданному курсу.
    Вызовите его дважды в методе main() c любыми параметрами, результат напечатайте в консоль
     */

    public double toUSD (int byn, double course){
        double perevod = byn*course;
        return perevod;
    }
}
