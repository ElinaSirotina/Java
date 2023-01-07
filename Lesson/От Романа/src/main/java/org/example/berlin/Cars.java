package org.example.berlin;

public class Cars {

    final int WEIGHT = 1300;
    private String model_outside = "audi";

    public Cars() {
        System.out.println("Hello from Berlin cars");
    }

    public void registration() {
        String model = "c200";
        System.out.println(model + ", registered");
    }

    public void deregistration(String model) {
        model_outside = model;
        System.out.println(model_outside + ", deregistred");
    }

    public String getModel_outside() {
        return model_outside;
    }

    public void setModel_outside(String i) {
        model_outside = i;
    }
}
