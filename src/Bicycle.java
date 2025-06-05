public class Bicycle extends Vehicle {
    private int gearCount;
    private double maxPedalSpeed;

    public Bicycle() {
        super("Bicycle");
        this.gearCount = 0;
        this.maxPedalSpeed = 0;
    }

    public Bicycle(int gearCount, double maxPedalSpeed) {
        super("Bicycle");
        this.gearCount = gearCount;
        this.maxPedalSpeed = maxPedalSpeed;
    }

    @Override
    public double calculateSpeed() {
        return maxPedalSpeed;
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Gear Count: " + gearCount);
        System.out.println("Max Pedal Speed: " + maxPedalSpeed);
    }
}
