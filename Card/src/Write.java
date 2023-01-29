import java.io.FileOutputStream;
import java.io.IOException;

public class Write {
    public static void write(String name,String data, int cvv, long number) throws IOException {
        String info = "Карта номер - " +number+", её владелец - "+name+", её cvv - "+cvv+" , срок действия - "+data;
        FileOutputStream out = new FileOutputStream("C://Users//Элина//Desktop//Programming//TelRan//Java//Card//src//info.txt");
        out.write(info.getBytes());
        out.close();


    }
}
