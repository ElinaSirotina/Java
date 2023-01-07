package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

      int[] array=new int[15];
      int scor=0;
      for (int i=0;i< array.length;i++){
          Random r=new Random(12);
// Значение seed меняйте для проверки
          array[i]=r.nextInt(0,9);
          System.out.println(array[i]);
          if(array[i] % 2 == 0) {
           scor++;
          }

      }
        System.out.println("-----"+scor);
    }
}
