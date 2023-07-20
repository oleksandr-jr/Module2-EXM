package L4.E1;

import java.util.Dictionary;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();

        if (duck instanceof CanFly){
            duck.fly();
        }
    }
}
