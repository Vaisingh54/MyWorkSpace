package Practice;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row of the array");
        int r = sc.nextInt();
        System.out.println("Enter column of the array");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Enter elements in array of the array");
        for (int i = 0; i < r; i++) {
            System.out.println("Enter " + (i + 1) + " row");
            for (int j = 0; j < c; j++) {

                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
