package org.itstep.qa.home.runner;

import org.itstep.qa.home.triangle.Circle;

public class RunnerCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Было: " + circle.getRadius());
        circle.setRadius(3);
        System.out.println("Стало: " + circle.getRadius());
        System.out.println("Площадь: " + circle.getAreaCircle());
        System.out.println("Радиус: " + circle.getLengthCircle());
    }
}
