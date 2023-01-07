package org.example;

public class Main {
    public static void main(String[] args) {
        Samsung a =new Samsung("s22",2022,6.44,246.3,true,"4555");
        Samsung c =new Samsung("s22",2022,6.44,246.3,true,"4555");
        Samsung f =new Samsung("s22",2022,6.44,246.3,true,"4555");
        DataBase b = new DataBase();
        b.addphone(a);
        b.addphone(c);
        b.addphone(f);
        System.out.println(b.getPhoneList());
        boolean f_empty = b.isEmpty(); // f_empty = true
        System.out.println("f_empty = " + f_empty);
        int size = b.getSize();
        System.out.println(size);
    }
}