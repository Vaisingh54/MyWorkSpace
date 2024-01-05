package Series;

public class RotateArray {

    public static void main(String[] args) {
        int[] A = { 3, 8, 9, 7, 6 };
        int k = 3;

        rotateArray(A, k);

    }

    public static void rotateArray(int[] A, int k) {
        int len = A.length;

        for (int i = 0; i < k; i++) {
            int lastNum = A[len - 1];

            for (int j = len - 2; j >= 0; j--) {
                A[j + 1] = A[j];
            }

            A[0] = lastNum;
        }
        for (int i : A) {
            System.out.print(i + " ");
        }

    }

}
