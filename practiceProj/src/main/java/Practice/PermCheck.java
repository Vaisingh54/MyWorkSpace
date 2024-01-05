package Practice;

import java.util.HashSet;

public class PermCheck {
    public static void main(String[] args) {
        int[] A = {};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // Implement your solution here
        HashSet<Integer> list = new HashSet<>();
        int len = A.length;
        int N = len;
        while (N > 0) {
            list.add(N);
            --N;
        }

        for (int i = 0; i < len; i++) {
            list.remove((Integer) A[i]);
        }

        if (list.isEmpty()) {
            return 1;
        } else {
            return 0;
        }

    }
}
