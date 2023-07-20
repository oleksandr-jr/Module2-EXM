package L17.E3_Methods;

import L17.Common.Car;
import L17.Common.Vehicle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Car> carClass = Car.class;

        List<Method> allMethods = List.of(carClass.getMethods());
        List<Method> declaredMethods = List.of(carClass.getMethods());

        declaredMethods.forEach(System.out::println);

        Method methodStart = carClass.getDeclaredMethod("start");
        methodStart.invoke(new Car("BMW", "X5"));

        Class<Vehicle> vehicleClass = Vehicle.class;
        System.out.println(vehicleClass.getName());

    }
}
