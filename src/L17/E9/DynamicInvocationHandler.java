package L17.E9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicInvocationHandler implements InvocationHandler {
    private final TstClass originalObject;

    public DynamicInvocationHandler(TstClass originalCar) {
        this.originalObject = originalCar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().equals("testMethod"))
        {
            System.out.println("[LOG] Method is started!");
        }
        return method.invoke(originalObject, args);
    }
}
