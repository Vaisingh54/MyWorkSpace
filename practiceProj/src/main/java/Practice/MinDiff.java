package Practice;

public class MinDiff {

    public static void main(String[] args) {
        int[] A = { 3, 1, 2, 4, 3 };
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // Implement your solution here
        // int len = A.length;
        // int parts = len - 1;
        // int p1 = 0, p2 = 0, mindif = Integer.MAX_VALUE;

        // for (int i = 1; i <= parts; i++) {
        // p1 = 0;
        // p2 = 0;
        // for (int j = 0; j < len; j++) {
        // if (j < i) {
        // p1 += A[j];
        // } else {
        // p2 += A[j];
        // }
        // }
        // int temp = Math.abs(p1 - p2);
        // mindif = Math.min(temp, mindif);
        // }

        int right = 0, left = 0, minDiff = Integer.MAX_VALUE;

        for (int i : A) {
            right += i;
        }

        for (int i = 0; i < A.length - 1; i++) {
            right -= A[i];
            left += A[i];

            if (Math.abs((left - right)) < minDiff) {
                minDiff = Math.abs(left - right);
            }
        }

        return minDiff;
    }

}
