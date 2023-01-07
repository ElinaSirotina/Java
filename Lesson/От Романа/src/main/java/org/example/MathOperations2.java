package org.example;

public class MathOperations2 {

    private double y;

    public void equationVoid(double x) {
        y = 2*x + 4;
    }

    public double equation(double x) {
        double y = 2*x + 4;
        return y;
    }

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

    public double getY() {
        return y;
    }
}
