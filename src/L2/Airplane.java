package L2;

public class Airplane  extends Transport{

    public Airplane(int maxPassengerCapacity) {
        super(maxPassengerCapacity);
    }

    @Override
    public void transportation() {
        System.out.println("air travel");
    }
}
