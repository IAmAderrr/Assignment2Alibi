public class Main {
    public static void main(String[] args) {

        Driver driver1 = new Driver("Olzhas", "468AID02");
        Driver driver2 = new Driver("Galymzhan", "139KAT13");

        Vehicle car = new Car("Toyota", 2022, 4, "Petrol", driver1);
        Vehicle motorcycle = new Motorcycle("Yamaha", 2021, false, driver1);
        Vehicle truck = new Truck("Volvo", 2020, 15.5, 6, driver2);

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = motorcycle;
        vehicles[2] = truck;

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].startEngine();
            vehicles[i].displayInfo();
            vehicles[i].displayDriver();
            vehicles[i].stopEngine();
            System.out.println();
        }
    }
}