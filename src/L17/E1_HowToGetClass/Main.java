package L17.E1_HowToGetClass;

import L17.Common.Car;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Car> carClass1 = Car.class;

        Car car = new Car("BMW", "X5");
        Class<? extends Car> carClass2 = car.getClass();

        Class<?> carClass3 = Class.forName("L17.Common.Car");


        List<Class<?>> interfaces = List.of(carClass1.getInterfaces());
        interfaces.forEach(System.out::println);

        Class<? super Car> superclass = carClass1.getSuperclass();
        System.out.println(superclass);
        Arrays.stream(superclass.getInterfaces()).forEach(System.out::println);


    }
}
