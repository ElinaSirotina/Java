package paramClass;

import java.lang.constant.Constable;

public class ParametrizedClassEx {
    public static void main(String[] args) {
        //Info<String> info = new Info<>("!!!!");
//        System.out.println(info);
//        String s = info.getValue();

        Info<Integer> infoInt = new Info<>(11);
        System.out.println(infoInt);
    }

//    public void get(Info<String> info){
//        String s = info.getValue();
//    }
//
//    public void get(Info<Integer> info){
//        Integer s = info.getValue();
//    }
}

class Info<T extends Number & Constable> { //implements Constable
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Info: " + value;
    }
}

interface  Inter{

}

interface Supers{

}
//class Parent<T>{
//    public void get(Info<Integer> info){
//        Integer s = info.getValue();
//    }
//}
//
//class Child<T> extends  Parent<T>{
//    public void get(Info<Integer> info){
//        Integer str = info.getValue();
//    }
//}