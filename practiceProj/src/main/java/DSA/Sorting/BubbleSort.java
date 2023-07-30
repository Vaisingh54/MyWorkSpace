package DSA.Sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the array : ");
        final int size = sc.nextInt();
        int[] arr = new int[size];
        Random rd = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = rd.nextInt(100);
        }

        System.out.println("[Start] unsorted array : ");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr, size);
        sc.close();
    }

    public static void bubbleSort(int[] arr, int n) {

        if (n == 0) {
            System.out.println("[END] Sorted array : ");
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            int temp = arr[i];
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            } else
                continue;
        }
        bubbleSort(arr, n - 1);
    }

}
