package L6_Comparators.E1;

public class Car {
    private static int count = 0;

    private final String brand;
    private final String model;

    private final int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.serialNumber = count++;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }


}
