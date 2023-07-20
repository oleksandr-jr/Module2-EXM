package L13.E2_FM.transport;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Ship delivery");
    }
}
