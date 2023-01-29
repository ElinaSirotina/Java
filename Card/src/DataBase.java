import java.util.ArrayList;
import java.util.List;

public class DataBase {
    static List<Card> sList = new ArrayList<>();


    public void addsr(Card card){

        sList.add(card);
    }


    public List<Card> getlist() {

        return sList;
    }



    public boolean isEmpty() {

        boolean s = true;
        if (sList.size()<1){
            s=false;
        }else {
            s=true;
        }
        return s;
    }
    public int getSize() {
        return sList.size();
    }
}
