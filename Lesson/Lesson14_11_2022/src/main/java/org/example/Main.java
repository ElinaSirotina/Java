package org.example;


            public static void main(String[] args) {
                phoneSamsung s22 = new phoneSamsung("galaxy s22",2022,6.4,192.6,true);


            public static class phoneSamsung{
                String model;
                int year;
                double display;
                double weight;
                boolean fastCharge;

                public phoneSamsung(String model, int year,double display,double weight,boolean fastCharge){
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




        }
    }
}