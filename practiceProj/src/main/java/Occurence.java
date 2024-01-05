import java.util.Arrays;
import java.util.HashSet;

public class Occurence {

    public static void main(String[] args) {
        // System.out.println(solution(new int[] { 1, 1, 3, 4, 3, 2, 2 }));

        String str = "211";
        int n = str.charAt(0);
        System.out.println(n - 48);
    }

    public static int solution(int[] A) {

        Arrays.sort(A); // 1,1,2,2,3,3,4
        HashSet<Integer> list1 = new HashSet<>();

        for (int i : A) {
            list1.add(i);
        }

        // String str = list1.toString();

        HashSet<Integer> list = new HashSet<>();
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            int num = Integer.parseInt("str.charAt(i)");

            for (int j = i + 1; j < A.length; j++) {
                if (A[j] == num) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == num) {
                if (list.iterator().next() < num) {
                    list.add(num);
                }
            }

        }
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.iterator().next();
        }

    }
}
