package myHello;

public class Main {
    public static String str;

    public static String getStr() {
        return str;
    }

    public static void setStr(String str) {
        Main.str = str;
    }

    public static void main(String[] args) {
        setStr("Hello World");
    }
}
