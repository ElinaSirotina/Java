package org.example;

import java.util.LinkedList;

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
public class ListIterator {
    public static void main(String[] args) {
        String s = "world";
        List<Character> list = new LinkedList<>();

        Linkedlist.add("word");

        ListIterator<String> listIterator = Linkedlist.listIterator();
        while (ListIterator.hasNext()) {
            System.out.println());
        }

    }
}
