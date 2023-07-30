package Practice;

import java.util.*;

public class Test2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hbfca");
        // sb.append(str);
        // sb.reverse();
        // String res = sb.toString();
        // System.out.println(res.equals(str));
        // for (int i = str.length() - 1; i >= 0; i--) {
        // sb.append(str.charAt(i));
        // }
        for (int i = 0; i < sb.length() / 2; i++) {

            int front = i;
            int back = sb.length() - 1 - i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);

    }

}
