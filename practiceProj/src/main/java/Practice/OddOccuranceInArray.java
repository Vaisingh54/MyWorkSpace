package Practice;

import java.util.HashSet;

public class OddOccuranceInArray {

    public static void main(String[] args) {
        int[] A = { 9, 3, 9, 3, 9, 7, 9 };

        System.out.println(solution(A));
    }

    public static int solution(int[] A) {

        HashSet<Integer> check = new HashSet<>();
        check.add(A[0]);

        for (int i = 1; i < A.length; i++) {
            if (check.contains(A[i])) {
                check.remove(new Integer(A[i]));
            } else {
                check.add(A[i]);
            }
        }

        return check.iterator().next();

    }

}
