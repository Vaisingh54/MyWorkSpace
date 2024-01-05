package Practice;

public class FindBinaryGap {

    public static void main(String[] args) {
        int N = 20;

        System.out.println(Integer.toBinaryString(N));

        System.out.println(solution(N));
    }

    public static int solution(int N) {
        // Implement your solution here

        String bin = Integer.toBinaryString(N);
        int tracker = 0;
        int count = 0;
        int maxZero = Integer.MIN_VALUE;

        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                if (maxZero < count) {
                    maxZero = count;
                }
                count = 0;
                tracker++;
            } else {
                count++;
            }

        }

        if (tracker <= 1) {
            return 0;
        } else {
            return maxZero;
        }

    }

}
