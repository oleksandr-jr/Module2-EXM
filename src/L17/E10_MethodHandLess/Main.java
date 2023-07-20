package L17.E10_MethodHandLess;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class Main {
    public static void main(String[] args) throws Throwable {
        MethodHandles.publicLookup()
                .findStatic(Main.class, "testMethod", MethodType.methodType(void.class))
                .invoke();
    }

    public static void testMethod(){
        System.out.println("Hello");
    }
}
