public class Car extends Vehicle {
    private int engineCapacity;
    private double topSpeed;

    public Car() {
        super("Car");
        this.engineCapacity = 0;
        this.topSpeed = 0;
    }

    public Car(int engineCapacity,double topSpeed) {
        super( "Car");
        this.engineCapacity = engineCapacity;
        this.topSpeed = topSpeed;
    }

    @Override
    public double calculateSpeed() {
        return topSpeed;
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Engine Capacity: " + engineCapacity);
        System.out.println("Top Speed: " + topSpeed);
    }
}
