package DSA.Sorting;

import java.util.Arrays;

public class ShellSorting {

    public static void main(String[] args) {

        int[] arr = { 20, 35, -15, 7, 55, 1, -22 };
        int size = arr.length;
        System.out.println("[Start] UnSorted array : ");
        System.out.println(Arrays.toString(arr));

        for (int gap = size / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < size; i++) {
                int newElement = arr[i];
                int j = i;
                while (j >= gap && newElement < arr[j - gap]) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = newElement;
            }
        }

        System.out.println("[End] Sorted array : ");
        System.out.println(Arrays.toString(arr));

    }

}
