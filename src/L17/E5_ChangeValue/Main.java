package L17.E5_ChangeValue;

import L17.Common.Car;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Car car = new Car("BMW", "X5");
        Class<? extends Car> aClass = car.getClass();

        Field model = aClass.getField("brand");
//        model.setAccessible(true);
        model.set(car, "Audi");

        System.out.println(car);
    }
}
