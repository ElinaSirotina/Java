import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        User u1 = new User("Ivan","Ivanov",30);
        User u2 = new User("Ivan","Ivanov",30);
        User u3 = new User("Ivan","Ivanov",30);
        User u4 = new User("Ivan","Ivanov",30);
        User u5 = new User("Ivan","Ivanov",30);
        User u6 = new User("Ivan","Ivanov",30);
        User u7 = new User("Ivan","Ivanov",30);
        User u8 = new User("Ivan","Ivanov",30);
        User u9 = new User("Ivan","Ivanov",30);
        User u10 = new User("Ivan","Ivanov",30);
        Car c1 = new Car("Lexus","is300",2020);
        Car c2 = new Car("Lexus","is300",2020);
        Car c3 = new Car("Lexus","is300",2020);
        Car c4 = new Car("Lexus","is300",2020);
        Car c5 = new Car("Lexus","is300",2020);
        Car c6 = new Car("Lexus","is300",2020);
        Car c7 = new Car("Lexus","is300",2020);
        Car c8 = new Car("Lexus","is300",2020);
        Car c9 = new Car("Lexus","is300",2020);
        Car c10 = new Car("Lexus","is300",2020);

        HashMap<Object,Object> map1 = new HashMap<>();
        map1.put(u1,c1);
        map1.put(u2,c2);
        map1.put(u3,c3);
        map1.put(u4,c4);
        map1.put(u5,c5);
        map1.put(u6,c6);
        map1.put(u7,c7);
        map1.put(u8,c8);
        map1.put(u9,c9);
        map1.put(u10,c10);
        System.out.println(map1);
        System.out.println(map1.isEmpty());
        System.out.println(map1.size());
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        System.out.println(map1.get(u1));
        //map1.clear(); очистит map
    }
}