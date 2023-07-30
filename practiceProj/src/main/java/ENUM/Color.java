package ENUM;

public enum Color {

    RED("red"), BLACK("black"), WHITE("white");

    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
