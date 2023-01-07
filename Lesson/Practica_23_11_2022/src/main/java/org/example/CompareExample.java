package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CompareExample {
    private String letters;
    private Integer num;

    public CompareExample (String letters, Integer num) {
        this.letters = letters;
        this.num = num;
    }

    public int compareTo(Integer ce) {
        int res = this.letters.compareTo(ce.letters);
        if (res==0) {
            res = this.num.compareTo(ce.num);
        }
        return res;
    }


        public static void main(String[] args) {

            CompareExample cpe1 = new CompareExample("abc", 3);
            CompareExample cpe2 = new CompareExample("abc", 4);
            CompareExample cpe3 = new CompareExample("abc", 5);
            CompareExample cpe4 = new CompareExample("abc", 2);

            List<CompareExample> compex = new ArrayList<>();

            compex.add(cpe1);
            compex.add(cpe2);
            compex.add(cpe3);
            compex.add(cpe4);

            System.out.println();

            Collection.sort(compex);
            System.out.println(compex);

    }
    public int compareTo(CompareExample o) {
        return 0;

    }
}
