package org.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        String result = null;
        String s = "faaf";
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        System.out.println(list);
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> iteratorRevers = list.listIterator(list.size());
        System.out.println(iterator.hasNext());
        System.out.println(iteratorRevers.hasPrevious());
        while (iterator.hasNext() && iteratorRevers.hasPrevious()) {
            char value = iterator.next();
            System.out.println("iterator:" + value + " index:" + iterator.nextIndex());
            char value1 = iteratorRevers.previous();
            System.out.println("iteratorRevers:" + value1+" index:" + iteratorRevers.previousIndex());
            if (value!=value1){
                System.out.println("не полиндром");
                break;
            }
            if (iterator.nextIndex() ==(list.size()/2) && iteratorRevers.previousIndex() ==(list.size()/2-1) ){
                break;

            }
            if(value==value1){

                result = "Полиндром";
            }else {
                result = "НЕ Полиндром";
            }

        }
        System.out.println(result);
    }
}