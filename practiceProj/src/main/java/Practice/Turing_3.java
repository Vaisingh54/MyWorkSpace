package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Turing_3 {

    public static void main(String[] args) {

        // List<Integer> l1 = Arrays.asList(0, 2);

        // List<Integer> l2 = Arrays.asList( 1, 1);

        // List<List<Integer>> ls = new ArrayList<>();
        // ls.add(l1);
        // ls.add(l2);

        List<Integer> l1 = Arrays.asList(2, 1);

        List<Integer> l2 = Arrays.asList(1, 1);

        List<Integer> l3 = Arrays.asList(0, 0);

        List<List<Integer>> ls = new ArrayList<>();
        ls.add(l1);
        ls.add(l2);
        ls.add(l3);

        System.out.println(checkPossible(ls));

    }

    public static String checkPossible(List<List<Integer>> container) {

        if (container.size() == 0) {
            return "Impossible";
        }
        int n = container.size();
        int m = container.get(0).size();
        if (n < m) {
            return "Impossible";
        }
        int numOfCont = container.size();
        int sizeOfCont = 0;
        int typeOfBall = 0;
        int maxSize = Integer.MIN_VALUE;
        int minSize = Integer.MAX_VALUE;
        int maxType = Integer.MIN_VALUE;
        int minType = Integer.MAX_VALUE;
        List<Integer> l = new ArrayList();
        List<Integer> l1 = new ArrayList();

        // To find the max and min size of container available
        for (int i = 0; i < numOfCont; i++) {

            l = container.get(i);
            sizeOfCont = 0;
            for (int j = 0; j < l.size(); j++) {
                sizeOfCont = sizeOfCont + l.get(j);
            }
            maxSize = Math.max(maxSize, sizeOfCont);
            minSize = Math.min(minSize, sizeOfCont);

            // To find the max and min type of balls available
            typeOfBall = 0;
            for (int j = 0; j < numOfCont; j++) {
                l1 = container.get(j);
                typeOfBall = typeOfBall + l1.get(i);
            }
            maxType = Math.max(maxType, typeOfBall);
            minType = Math.min(minType, typeOfBall);
        }

        if (maxSize >= maxType && minSize >= minType) {
            return "Possible";
        } else {
            return "Impossible";
        }
    }

}
