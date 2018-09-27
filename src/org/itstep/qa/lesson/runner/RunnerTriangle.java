package org.itstep.qa.lesson.runner;

import org.itstep.qa.lesson.geometry.Triangle;

public class RunnerTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.getMultiple(1,2,3);
        triangle.getMultiple(1,2.3,3.3);
        triangle.getMultiple(1.1,2.2,3.3);
        triangle.getMultiple(2,4);
    }

}
