package L2;

public class Car extends Transport{

    public Car(int maxPassengerCapacity) {
        super(maxPassengerCapacity);
    }

    @Override
    public void transportation() {
        System.out.println("Car travel");
    }

}
