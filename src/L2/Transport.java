package L2;

public abstract class Transport {
    private int passengerCapacity;
    private int reservedSeats;

    private String model;
    private String color;
    private int maxSpeed;

    public Transport(int maxPassengerCapacity){
        passengerCapacity = maxPassengerCapacity;
    }

    public boolean reserveSeat(int amount){
        if (getAvailableSeats() >= amount){
            reservedSeats -= amount;
            return true;
        }

        return false;
    }

    public int getAvailableSeats(){
        return passengerCapacity - reservedSeats;
    }

    public abstract void transportation();
}
