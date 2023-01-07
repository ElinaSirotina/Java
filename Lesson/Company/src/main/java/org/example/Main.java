package org.example;

import db.DB;
import model.Bottom;
import model.Middle;
import model.Top;

import static service.Service.*;

public class Main {
    public static void main(String[] args) {

        Top s1 = new Top("Олег",25, Position.top);
        Middle s2 = new Middle("Олег",25, Position.middle);
        Bottom s3 = new Bottom("Олег",25, Position.bottom);
        s1.give();
        DB d = new DB();
        d.addsr(s1);
        System.out.println(d.getlist());
        boolean f_empty = d.isEmpty(); // f_empty = true
        System.out.println("f_empty = " + f_empty);
        int size = d.getSize();
        System.out.println(size);
        System.out.println(s1.getP());
        System.out.println(s2.getP());
        System.out.println(s3.getP());
        changePosition(s1);
        changePosition1(s2);
        changePosition2(s3);
        System.out.println(s1.getP());
        System.out.println(s2.getP());
        System.out.println(s3.getP());
    }
}