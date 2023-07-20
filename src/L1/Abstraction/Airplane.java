package L1.Abstraction;

public class Airplane {
    private final int passengerSeatsAmount;
    private int reservedSeats;

    public Airplane(int passengerSeatsAmount){
        this.passengerSeatsAmount = passengerSeatsAmount;
    }

    public boolean reserveSeats(int amount){
        if (passengerSeatsAmount - reservedSeats < amount){
            return false;
        }
            reservedSeats += amount;
            return true;
    }
}
