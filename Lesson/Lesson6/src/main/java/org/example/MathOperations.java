package org.example;

public class MathOperations {

    private double result;

    private double resExp;
    private double resSum;
    private double resDer;

    public void der(double x) {
        resDer = 1 / x;
    }

    public void sum(double x) {
        resSum = 1 + x;
    }

    public void exp(float x) {
        resExp = Math.exp(-x);
    }

    public void getSigmoid2(float x) {
        exp(x);
        sum(resExp);
        der(resSum);
    }

    public void getSigmoid(float x) {
        result = 1 / (1 + Math.exp(-x));
    }

    public double getResult() {
        return result;
    }
    public double getResDer() {
        return resDer;
    }
}
