package L6_Comparators.E1;

import L6_Comparators.E1.comparators.BrandComparator;
import L6_Comparators.E1.comparators.SerialNumberComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortRun {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car car0 = new Car("Mercedes", "G63");
        Car car1 = new Car("Mercedes", "C220");
        Car car2 = new Car("Audi", "Q7");
        Car car3 =  new Car("Audi", "A8");
        Car car4 = new Car("BMW", "X5");

        cars.add(car4);
        cars.add(car3);
        cars.add(car2);
        cars.add(car0);
        cars.add(car1);


        SerialNumberComparator serialNumberComparator = new SerialNumberComparator();
        BrandComparator brandComparator = new BrandComparator();

        System.out.println("Serial Number comparator");
        printDiff(cars, serialNumberComparator);

        System.out.println("Brand comparator");
        printDiff(cars, brandComparator);
    }

    public static void printDiff(List<Car> list, Comparator<Car> carComparator){
        System.out.println('\n' +"Before");
        System.out.println("------------------------------");
        for (Car car : list) {
            System.out.println(car);
        }

        Sort.bubbleSort(list, carComparator);

        System.out.println("\n" + "After");
        System.out.println("------------------------------");
        for (Car car : list) {
            System.out.println(car);
        }
    }
}
