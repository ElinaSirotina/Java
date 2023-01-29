import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateData {
    public  long generate_number(){
        long number = (new Random().nextLong() % 100000000000000L) + 5200000000000000L;
        return number;
    }
    public int generate_cvv(){
        int num1 = ThreadLocalRandom.current().nextInt(0, 9 + 1);
        int num2 = ThreadLocalRandom.current().nextInt(0, 9 + 1);
        int num3 = ThreadLocalRandom.current().nextInt(0, 9 + 1);
        String str = num1+""+num2+""+num3;
        int cvv = Integer.parseInt(str);
        return cvv;
    }
    public String generate_data(){
        String num1 = String.valueOf(ThreadLocalRandom.current().nextInt(1, 12 + 1));
        String num2 = String.valueOf(ThreadLocalRandom.current().nextInt(23, 33 + 1));
        int n = Integer.parseInt(num1);
        if(n<10){
            num1="0"+num1;
        }
        String data = num1+"/"+num2;
        return data;
    }
    public String generate_name(){
        String name = null;
        String[] m_name = {"Олег","Виктор","Дмитрий","Иван","Роман"};
        String[] m_lastname = {"Волков","Егоров","Иванов","Менякин","Коссе"};
        String[] g_name = {"Элина","Людмила","София","Ульяна","Ксения"};
        String[] g_lastname = {"Романова","Егорова","Иванова","Менякина","Коссе"};
        int random = ThreadLocalRandom.current().nextInt(0, (1) +1);
        int i1 = ThreadLocalRandom.current().nextInt(0, (m_name.length-1) +1);
        int i2 = ThreadLocalRandom.current().nextInt(0, (m_lastname.length) + 1);
        if(random==0){
            name = m_name[i1]+" "+m_lastname[i2];
        }else{
            name = g_name[i1]+" "+g_lastname[i2];
        }
        return name;
    }
}
