package Practice;

import java.util.ArrayList;
import java.util.List;

public class SumOFNum {

    public static void main(String[] args) {
        List <Integer> ar = new ArrayList<>(null);
         ar.add(1);
         ar.add(2);
         ar.add(3);
         ar.add(4);
         ar.add(5);

         System.out.println(sum(ar));

    }

    public static int  sum(List<Integer> ar){

        int res =0;

        for (var i = 0; i < ar.size(); i++) {
            res = res + ar.get(i);
            
        }
        return res;
    }
}