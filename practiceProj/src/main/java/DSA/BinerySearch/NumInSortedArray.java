package DSA.BinerySearch;

public class NumInSortedArray {

    public static void main(String[] args) {

        int[] arr = { -3, -2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = -3;

        System.out.println(findTargetNum(arr, target));
    }

    static int findTargetNum(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

}
