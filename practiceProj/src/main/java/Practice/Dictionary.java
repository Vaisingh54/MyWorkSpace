package Practice;

import java.util.Arrays;

public class Dictionary {
    public static void main(String[] args) {

        String[] str = { "bb", "cc", "aa", "dd" };
        int i = 0;

        while (i < str.length - 1) {

            String temp = str[i];
            if (temp.compareTo(str[i + 1]) > 1) {
                str[i] = str[i + 1];
                str[i + 1] = temp;
                i=i*0;
            }
            i++;

        }

        System.out.println(Arrays.toString(str));

    }

}