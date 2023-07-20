package L15.E1_Inner;

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

    public void start(){
        CarComputer computer = new CarComputer();
        try {
            computer.checkBrakes();
            computer.checkFuel();
            computer.checkSensors();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        CarComputer.innerStaticMethod();
        System.out.println("Car started");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    private void turnOnFuelPump(){

    }

    class CarComputer {

        private static boolean testPassed = true;

        private static void innerStaticMethod(){
            System.out.println("static Method");
        }
        void checkFuel(){
            Car.this.turnOnFuelPump(); // Call external private method
            if (Math.random() > 0.95){
                throw new RuntimeException("Fuel exception");
            }
        }
        void checkBrakes(){
            if (Math.random() > 0.95) {
                throw new RuntimeException("Brakes exception");
            }
        }

        void checkSensors(){
            if (Math.random() > 0.95) {
                throw new RuntimeException("Sensor exception");
            }
        }

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
