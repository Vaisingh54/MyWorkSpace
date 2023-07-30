package DSA.Sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the array : ");
        final int size = sc.nextInt();
        int[] arr = new int[size];
        Random rd = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = rd.nextInt(100);
        }

        // int[] arr = { 20, 35, -15, 7, 55, 1, -22 };
        // int size = arr.length;
        System.out.println("[Start] UnSorted array : ");
        System.out.println(Arrays.toString(arr));
        sc.close();

        for (int i = size - 1; i > 0; i--) {

            int largest = 0;

            for (int j = 1; j <= i; j++) {
                if (arr[j] > arr[largest]) {
                    largest = j;
                }
            }
            swap(arr, largest, i);

        }

        System.out.println("[END] Sorted array : ");
        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
