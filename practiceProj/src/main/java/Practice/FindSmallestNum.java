package Practice;

import java.util.Arrays;

public class FindSmallestNum {

    public static void main(String[] args) {

        int[] A = { 1, 3, 6, 4, 1, 2 };

        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // Implement your solution here
        int result = 1;

        Arrays.sort(A);

        System.out.println(A.toString());

        for (int i = 0; i < A.length; i++) {
            if (A[i] == result) {
                result++;
            } else {
                continue;
            }
        }

        return result;
    }

}
