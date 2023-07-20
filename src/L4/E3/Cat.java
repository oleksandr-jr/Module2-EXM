package L4.E3;

public class Cat {
    private int energy = 50;

    public void eat(Food food){
        energy += food.getEnergy();
    }

    public int getEnergy() {
        return energy;
    }
}
