package org.itstep.qa.home.triangle;

public class Circle {
    //Создайте в классе Circle метод, вычисляющий длину окружности. Проверьте работу метода в главном классе.

    private double radius;

    // задать радиус
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //узнать радиус
    public double getRadius () {
        return radius;
    }

    //узнать площадь
    public double getAreaCircle() {
        return Math.PI*radius*radius;
    }

    //узнать длину окружности
    public double getLengthCircle() {
        return 2*Math.PI*radius;
    }

}
