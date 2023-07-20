package L6_Comparators.E1;

import java.util.Comparator;
import java.util.List;

public class Sort {

    public static void bubbleSort(List<Car> cars, Comparator<Car> comparator) {

        for (int i = 0; i < cars.size() - 1; i++) {

            for (int j = 0; j < cars.size() - i - 1; j++) {

                if (comparator.compare(cars.get(j + 1), cars.get(j)) < 0) {
                    Car swap = cars.get(j);
                    cars.set(j, cars.get(j + 1));
                    cars.set(j + 1, swap);
                }
            }
        }
    }
}
