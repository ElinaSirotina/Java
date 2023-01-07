package org.example;

public enum Type {
    one("smartphone"),two("pushbuttonphone");
    String typephone;



    Type(String typephone) {
        this.typephone=typephone;
    }



    public static void returntype(){
//        Type[] t = Type.values();
//        for (Type s : t) {
//            System.out.println(s);
//        }
        for (Type t : Type.values()) {
            System.out.println(t + " - " + t.typephone);
        }
    }
}
