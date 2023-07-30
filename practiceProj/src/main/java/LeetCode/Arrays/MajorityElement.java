package LeetCode.Arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int A[] = { 3, 2, 3 };
        int N = A.length;
        int maj = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (count == 0) {
                maj = A[i];
                count = 1;
            } else if (A[i] == maj) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == maj) {
                count++;
            }
        }
        if (count > N / 2) {
            System.out.println(maj);
        } else {
            System.out.println("no majority element");
        }
    }

}
