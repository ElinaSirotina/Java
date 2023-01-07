package org.example;

public class LG extends Phone{
    private String battery;

    public LG (String model, int year, double display, double weight, boolean fastCharge, String battery){
        super(model, year, display, weight, fastCharge);
        this.battery=battery;
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
    public String getBattery(){
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }
}
