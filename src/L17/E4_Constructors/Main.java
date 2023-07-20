package L17.E4_Constructors;

import L17.Common.Car;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        classNewInstance();
        constructorNewInstance();
    }

    public static void classNewInstance() throws InstantiationException, IllegalAccessException {
        Class<Car> carClass = Car.class;
        Car car = carClass.newInstance();
        System.out.println(car);
    }

    public static void constructorNewInstance() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Car> constructor = Car.class.getConstructor(String.class, String.class);
        Car car = constructor.newInstance("NEW", "Car");
        System.out.println(car);

    }


    public static void findExactConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Car> constructor = Car.class.getConstructor(String.class, String.class);
        Car car = constructor.newInstance("CAR1", "Model1");
        System.out.println(car);
    }

    public static void findConstructors() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        List<Constructor<?>> constructors = List.of(Car.class.getConstructors());
        //Map<? extends Constructor<?>, Integer> collect = constructors.stream().collect(Collectors.toMap(x -> x, Constructor::getParameterCount));

        Optional<Constructor<?>> biggestConstructor = constructors.stream()
                .max((Comparator.comparingInt(Constructor::getParameterCount)));

        Constructor<?> myConstructor;

        if(biggestConstructor.isPresent()) {
            myConstructor = biggestConstructor.get();
            myConstructor.newInstance("BMW", "X5");
        }
    }




}
