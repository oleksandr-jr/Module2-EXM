package L4.E2;

public class Car implements Drivable{
    @Override
    public void turnOn() {
        System.out.println("Car is turned on");
    }

    @Override
    public void forward() {
        System.out.println("car Forward");
    }

    @Override
    public void reverse() {
        System.out.println("car reverse");
    }

    @Override
    public void turnLeft() {
        System.out.println("car Turn left");
    }

    @Override
    public void turnRight() {
        System.out.println("Car turn right");
    }
}
