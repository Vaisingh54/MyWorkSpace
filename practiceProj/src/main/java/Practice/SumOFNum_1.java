package Practice;

import java.math.BigInteger;

public class SumOFNum_1 {

    public static void main(String[] args) {
        int n = 30;

        fact(n);

    }

    public static void fact(int n) {

        BigInteger res = BigInteger.ONE;
        while (n > 0) {
            res = res.multiply(BigInteger.valueOf(n));
            --n;
        }
        System.out.println(res);
    }
}