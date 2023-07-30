package DSA.Sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class IncersionSort {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Please enter the size of the array : ");
        // final int size = sc.nextInt();
        // int[] arr = new int[size];
        // Random rd = new Random();

        // for (int i = 0; i < size; i++) {
        // arr[i] = rd.nextInt(100);
        // }

        int[] arr = { 20, 35, -15, 7, 55, 1, -22 };
        int size = arr.length;
        System.out.println("[Start] UnSorted array : ");
        System.out.println(Arrays.toString(arr));
        // sc.close();

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < size; firstUnsortedIndex++) {
            int newEle = arr[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newEle; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = newEle;

        }

        System.out.println("[End] Sorted array : ");
        System.out.println(Arrays.toString(arr));
    }

}
