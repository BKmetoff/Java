package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_solution;

public class Vehicle {
    private int wheels;
    private int topSpeed;
    private int yearOfManufacture;
    private String make;
    private String model;

    public Vehicle(){}

    public Vehicle(int numberOfWheels){
        this.wheels = numberOfWheels;
    }

    public Vehicle(
            int wheels,
            int topSpeed,
            int yearOfManufacture,
            String make,
            String model){
        this.wheels = wheels;
        this.topSpeed = topSpeed;
        this.yearOfManufacture = yearOfManufacture;
        this.make = make;
        this.model = model;
    }

    public void setWheels(int wheels) { this.wheels = wheels; }
    public int getWheels() { return wheels; }

    public int getTopSpeed() { return topSpeed; }

    public int getYearOfManufacture() { return yearOfManufacture; }

    public void setMake(String make) { this.make = make; }
    public String getMake() { return make; }

    public String getModel() { return model; }

    public void addCargoToVehicle() {
        System.out.println("adding cargo. grandparent");
    }

}
