package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PalindromeIterator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово");
        String word = scan.nextLine();
        System.out.println(polindrom(word));

    }

    public static String polindrom(String str){
        String str1 = new StringBuilder(str).reverse().toString();
        if(str1.equals(str)){
            return "Полиндром";

        }else {
            return "Не полиндром";
        }
    }
}
public class ListIterator {
    public static void main(String[] args) {
        String s = "world";
        List<Character> list;
        list = new LinkedList<>();

        ArrayList<String> Linkedlist;
        Linkedlist = null;
        Linkedlist.add("word");

        java.util.ListIterator<String> listIterator = Linkedlist.listIterator();
        while (ListIterator.hasNext() && listIterator.hasPrevious()) {
            System.out.println("Проверка");
            if (iterator.hasNext() !)
        }

    }

    private static boolean hasNext() {


}

    public static String polindrom(String str){
        StringBuffer str1 = new StringBuffer(str);
        str1.reverse();
        int score =0;
        for(int i = 0; i<str.length();i++){
            for(int j =0;j<str1.length();j++){
                if ( str.charAt(i)==str1.charAt(j)){
                    score++;

                }
            }
        }
        if (score/2 ==str.length()){
            System.out.println("Полиндром");
        }else {
            System.out.println("Не Полиндром");
        }


        return str;
    }

