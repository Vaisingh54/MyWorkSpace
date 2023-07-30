package Practice;

public class CountString {
    public static void main(String[] args) {

        String str = "oiugc8wygcx";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'c') {
                count++;
            }
        }

        System.out.println(count);
    }

}
