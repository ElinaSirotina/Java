package org.example;

public class MathOperations2 {

    private double exp(float x) {
        double result = Math.exp(-x);
        return result;
    }

    private double sum(double x) {
        double result = 1 + x;
        return result;
    }

    private double der(double x) {
        double result = 1 / x;
        return result;
    }

    public double getSigmoid2(float x) {
        double result = der(sum(exp(x)));
        return result;
    }

    public double getSigmoid(float x) {
        double result = 1 / (1 + Math.exp(-x));
        return result;
    }
}
