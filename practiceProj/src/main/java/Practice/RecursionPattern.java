package Practice;

public class RecursionPattern {

    public static void main(String[] args) {

        String str = "*";
        int n = 10;
        star(str, n);

    }

    public static void star(String str, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(str);
        n--;
        StringBuilder sb = new StringBuilder(str);
        sb.append("*");
        String res = sb.toString();
        star(res, n);
    }

}