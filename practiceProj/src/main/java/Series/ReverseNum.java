package Series;

import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
               String str = sc.nextLine();
               reverseNum(n);
               reverseStr(str);
        }
    }

    private static void reverseStr(String str) {

        String rev = "";
        int len = str.length();
        while(len!=0){

            rev = rev+str.charAt(len-1);
            len--;

        }
        System.out.println(rev);

    }

    private static void reverseNum(int n) {
        int reverse=0;
        while(n!=0)
        {
            reverse = reverse*10;
            reverse =reverse+n%10;
            n=n/10;
        }
        System.out.println(reverse);
    }
    
}
