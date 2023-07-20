package L6_Comparators.E1.comparators;

import L6_Comparators.E1.Car;

import java.util.Comparator;

public class SerialNumberComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getSerialNumber() - o2.getSerialNumber();
    }
}
