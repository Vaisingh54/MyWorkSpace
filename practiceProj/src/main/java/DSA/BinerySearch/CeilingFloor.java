package DSA.BinerySearch;

public class CeilingFloor {

    public static void main(String[] args) {

        int[] arr = { -3, -2, 13, 24, 35, 56, 77, 88, 89, 101 };
        int target = 33;
        int type = 0;

        System.out.println(findCeilingFloor(arr, target, type));

    }

    static int findCeilingFloor(int[] arr, int target, int type) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] >= target) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }

        if (type == 0) {
            return arr[start];
        } else
            return arr[end];
    }

}
