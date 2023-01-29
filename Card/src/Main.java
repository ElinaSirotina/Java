import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        GenerateData g = new GenerateData();
        long number = g.generate_number();
        int cvv = g.generate_cvv();
        String data = g.generate_data();
        String name = g.generate_name();
        Card card1 = new Card(number,name,cvv,data);
        Datastr str = new Datastr();
        System.out.println(str.data_str(name,data,cvv,number));
        DataBase db = new DataBase();
        db.addsr(card1);
        System.out.println(db.getlist());
        System.out.println(db.isEmpty());
        System.out.println(db.getSize());
        Write w = new Write();
        w.write(name,data,cvv,number);
        Read r = new Read();
        r.read();
    }
}