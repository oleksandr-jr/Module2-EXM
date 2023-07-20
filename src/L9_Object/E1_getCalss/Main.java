package L9_Object.E1_getCalss;

import L9_Object.E1_Equals.Employee;

import java.lang.reflect.Method;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String hello = "Hello World";

        System.out.println(hello.getClass());
        System.out.println(hello.getClass().getSimpleName());
        System.out.println(hello.getClass().getName());


        // Reflection
        Employee employee1 = new Employee("Employee1", 20, "DEV");
        List<Method> methods = List.of(employee1.getClass().getMethods());
        System.out.println(methods);


        // Why 31

        // n * 31 == (n << 5) - n

        //00000010 = 2

        // << 5
        //01000000 = 64

        // 64 - 2 = 62




    }
}
