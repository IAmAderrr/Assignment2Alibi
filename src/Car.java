public class Car extends Vehicle {
    private int doors;
    private String fuelType;

    public Car(String brand, int year, int doors, String fuelType, Driver driver) {
        super(brand, year, driver);
        this.doors = doors;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine is starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine is stopping");
    }
}
