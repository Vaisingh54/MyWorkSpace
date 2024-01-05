package Practice;

public class FrogQus {

    public static void main(String[] args) {
        System.out.println(solution(10, 85, 30));
    }

    public static int solution(double X, double Y, double D) {
        double dis = Y - X;
        int res = (int)Math.ceil(dis/(int)D);

        return res;
    }

}
