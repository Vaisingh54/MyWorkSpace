import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            swap(a, b);
        }
   }
    static void swap(int a, int b)
    {
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a is " +a);
        System.out.print("b is " +b);
    }

}
