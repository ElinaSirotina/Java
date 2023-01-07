package org.example;

public class Apple extends Phone implements Sale,Stilus{

    private String battery;

    public Apple(String model, int year, double display, double weight, boolean fastCharge, String battery){
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

    @Override
    public void isSale() {
        System.out.println("Распродажа");
    }

    @Override
    public void includeStilus() {
        System.out.println("Включает стилус");

    }

    @Override
    public void supportStilus() {
        System.out.println("Поддерживает стилус");

    }
}
