package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DataBase {

    static List<Phone> phoneList = new ArrayList<>();


    public void addphone(Phone phone){

        phoneList.add(phone);
    }


    public List<Phone> getPhoneList() {

        return phoneList;
    }



    public boolean isEmpty() {

        boolean s = true;
        if (phoneList.size()<1){
            s=false;
        }else {
            s=true;
        }
        return s;
    }
    public int getSize() {
        return phoneList.size();
    }
}
