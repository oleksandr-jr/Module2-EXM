package common;

public class Print {
    public static void ln(String text, String color) {
        Console.setColor(color);
        System.out.println(text);
        Console.resetColor();
    }

}
