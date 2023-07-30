package ENUM;

public class TestColor {

    public static void main(String[] args) {
        Color cr = Color.RED;

        System.out.println(cr.name());
        System.out.println(cr.getValue());

        for (Color color : cr.values()) {

            System.out.println(color.name());
        }
    }
}
