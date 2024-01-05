package Practice;

import java.util.HashSet;

public class FrogCross {

    public static void main(String[] args) {
        int[] A = { 2, 3, 6, 7, 8, 1, 4 };

        System.out.println(solution(5, A));
    }

    public static int solution(int X, int[] A) {
        // Implement your solution here

        HashSet<Integer> list = new HashSet<>();
        int len = A.length;

        while (X > 0) {
            list.add(X);
            --X;
        }

        for (int i = 0; i < len; i++) {
            if (list.remove((Integer) A[i])) {
                if (list.isEmpty()) {
                    return i;
                }
            }
        }

        return -1;
    }
}