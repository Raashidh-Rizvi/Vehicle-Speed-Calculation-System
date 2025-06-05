public abstract class Vehicle {
    private String vehicleName;

    public Vehicle() {
        this.vehicleName = "N/A";
    }
    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }
    public void displayVehicleDetails() {
        System.out.println("Vehicle Name: " + this.vehicleName);
    }
    public abstract double calculateSpeed();

    public double calculateSpeed(double factor){
        return factor * calculateSpeed();
    }







}
