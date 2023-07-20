package L17.E6_StandartProxy;

import L17.Common.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new CarProxy("BMW", "X5");

        car.start();
    }
}
