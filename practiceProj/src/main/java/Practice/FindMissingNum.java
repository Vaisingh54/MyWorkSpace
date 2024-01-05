package Practice;

import java.util.HashSet;

public class FindMissingNum {

    public static void main(String[] args) {
        int[] A = { 2, 3, 6, 7, 8, 1, 4 };
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // Implement your solution here

        HashSet<Integer> list = new HashSet<>();

        for (int i = 1; i <= A.length + 1; i++) {
            list.add(i);
        }

        for (int i = 0; i < A.length; i++) {
            list.remove((Integer) A[i]);
        }
        return list.iterator().next();
    }
}
