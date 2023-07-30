package DSA.BinerySearch;

public class FindMinInArray {

    public static void main(String[] args) {

        int[] arr = { 43, 34, 12, 1, 4, -12, 43, 212, 21 };

        System.out.println(minNum(arr));
        System.out.println(maxNum(arr));
    }

    static int minNum(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int maxNum(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        int min = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > min) {
                min = arr[i];
            }
        }
        return min;
    }

}
