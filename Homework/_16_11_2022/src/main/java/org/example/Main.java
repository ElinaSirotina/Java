package org.example;


public class Main {
    public static void main(String[] args) {
        //Level1
        // 1)
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input a radius: ");
//        int radius = in.nextInt();
//        double area = 3.14 * (Math.pow(radius, 2));
//        System.out.printf("The area of an circle with radius %d = %f \n", radius, area);
//        //2)
//        Scanner on = new Scanner(System.in);
//        System.out.print("Input name: ");
//        String name = on.nextLine();
//        System.out.printf("Hello,%s \n", name);
//
//        in.close();
        //Level2
        //1)
        String a = new String("I study basic java!");
        System.out.println(a);

        //2)

        System.out.println(a.charAt(a.length()-1));

        //3)


        System.out.println(a.replace("a", "*"));
    }

}