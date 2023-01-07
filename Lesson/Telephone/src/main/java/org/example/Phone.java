package org.example;

public class Phone {
    String model;
    int year;
    double display;
    double weight;
    boolean fastCharge;
    public Phone(String model, int year,double display,double weight,boolean fastCharge){
        this.model=model;
        this.year =year;
        this.display = display;
        this.weight = weight;
        this.fastCharge = fastCharge;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public double getDisplay(){
        return display;
    }
    public double getWeight(){
        return weight;
    }
    public  boolean getFastCharge(){
        return fastCharge;
    }

    public void  setModel(){
        this.model = model;
    }
    public void setYear(){
        this.year=year;
    }
    public void setDisplay(){
        this.display=display;
    }
    public void setWeight(){
        this.weight=weight;
    }
    public void setFastCharge(){
        this.fastCharge=fastCharge;
    }
}
