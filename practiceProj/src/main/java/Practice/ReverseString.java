package Practice;

public class ReverseString {

    public static void main(String[] args) {
        String str = "ab-cd";

        System.out.println(str.length());
        System.out.println(reverse(str));

    }

    public static String reverse(String str) {

        StringBuilder sb = new StringBuilder("");
        int size = str.length();

        for (int i = 0; i < size; i++) {
            sb.append(str.charAt(4 - i));
        }

        return sb.toString();

    }

}
