package subType;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        X x = new Y();
        //List<X> list = new ArrayList<Y>(); nemozna
        List<X> list = new ArrayList<>();

    }


}

class X{

}

class Y extends X{

}