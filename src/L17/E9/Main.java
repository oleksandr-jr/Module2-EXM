package L17.E9;

import L17.Common.Car;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        TstClass test = new TstClass();
        ClassLoader classLoader = test.getClass().getClassLoader();
        Class<?>[] interfaces = test.getClass().getInterfaces();

        DynamicInvocationHandler handler = new DynamicInvocationHandler(test);


        TestInterface newInstance = (TestInterface) Proxy.newProxyInstance(classLoader, interfaces, handler);

        newInstance.testMethod();
    }
}
