package L6_Comparators.E1.comparators;

import L6_Comparators.E1.Car;

import java.util.Comparator;

public class BrandComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
