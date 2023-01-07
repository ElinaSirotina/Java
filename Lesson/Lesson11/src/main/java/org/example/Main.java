package org.example;

//public class Main {
//    public static void main(String[] args) {
//
//        static void getIterFor(int maxFloors, int currentFloor) {
//            int count = 0;
//            for (int i = currentFloor; i <= maxFloors; i = i + 5 - 1) {
//                count++;
//            }
//            System.out.println("Number of iterations: " + count);
//        }
//
//        int maxFloors = 163;
//        int currentFloor = 0;
//
//        int count = 0;
//
//        for (int i = currentFloor; i <= maxFloors; i = i + 5 - 1) {
//            count++;
//        }
////        System.out.println(maxFloors % 4);
//    }
//
//}
//





public class Main {
    private static String getInputString(String s) {
        String words = getWordCount(s);
        return words.length();
    }

    private static int getWordCount(String s) {
        return s.split(" ");
    }
}