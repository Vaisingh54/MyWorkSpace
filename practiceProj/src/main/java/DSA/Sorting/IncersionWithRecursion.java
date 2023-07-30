package DSA.Sorting;

import java.util.Arrays;

public class IncersionWithRecursion {

    public static void main(String[] args) {

        int[] arr = { 20, 35, -15, 7, 55, 1, -22 };
        int size = arr.length;
        System.out.println("[Start] UnSorted array : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("[End] Sorted array : ");
        sortedArray(arr, size, 0);

    }

    static void sortedArray(int[] arr, int size, int i) {

        if (i == size) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int newElem = arr[i];
        int j;
        for (j = i; j > 0 && newElem < arr[j - 1]; j--) {
            arr[j] = arr[j - 1];
        }
        arr[j] = newElem;
        sortedArray(arr, size, i + 1);
    }

}
