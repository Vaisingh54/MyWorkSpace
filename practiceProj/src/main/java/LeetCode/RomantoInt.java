package LeetCode;

class RomantoInt {

    public static void main(String[] args) {

        String s = "III";
        int n = s.length();
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                    result = result + 4;
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                    result = result + 9;
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                    result = result + 40;
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                    result = result + 90;
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                    result = result + 400;
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                    result = result + 900;
                    i++;
                    continue;
                }
            }

            result = result + findValue(s.charAt(i));
        }
        System.out.println(result);

    }

    public static int findValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
