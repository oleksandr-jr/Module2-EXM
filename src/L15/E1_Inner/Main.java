package L15.E1_Inner;


public class Main {
    public static void main(String[] args) {
        Car car0 = new Car("Mercedes", "G63");

        car0.start();

        Car.CarComputer computer = car0.new CarComputer();

//        L6_Comparators.E1.Car car1 = new L6_Comparators.E1.Car("Mercedes", "C220");
//        L6_Comparators.E1.Car car2 = new L6_Comparators.E1.Car("Audi", "Q7");
//        L6_Comparators.E1.Car car3 =  new L6_Comparators.E1.Car("Audi", "A8");
//        L6_Comparators.E1.Car car4 = new Car("BMW", "X5");
    }
}
