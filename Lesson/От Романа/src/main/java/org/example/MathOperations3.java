package org.example;

public class MathOperations3 {

    private double square_result;

    public void getSquare(double radius) {
        square_result = 2 * radius * radius * Math.PI;
    }

    public double getSquare_result() {
        return square_result;
    }

    public double getSquare2(double radius) {
        return 2 * radius *radius * Math.PI;
    }

}
