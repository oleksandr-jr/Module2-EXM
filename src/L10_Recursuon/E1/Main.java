package L10_Recursuon.E1;

public class Main {
    static int i = 0;
    public static void main(String[] args) {
        foo();
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
    }

    static void foo(){
        System.out.println(i);
        i++;
        foo();
    }

    public static void countDown(int x) {
        if (x <= 0) {
            System.out.println("Count down!");
        } else {
            System.out.println(x);
            countDown(x - 1);
        }
    }
}
