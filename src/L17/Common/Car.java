package L17.Common;

import java.io.Serializable;

public class Car extends Transport implements Serializable {
    private static int count = 0;

    public String brand;
    private final String model;

    private final int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }

    public Car() {
        this.brand = "brand";
        this.model = "model";
        this.serialNumber = count++;
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

    public boolean start(){
        System.out.println("Vroom...");
        return true;
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

