package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Exercise_01_solution;

public class Car implements MotorizedVehicle {

    private int numberOfWheels;
    private int numberOfPassengers;
    private String make;
    private String model;

    public Car(){}

    public Car(int numberOfPassengers, int numberOfWheels, String make, String model) {
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfWheels = numberOfWheels;
        this.make = make;
        this.model = model;
    }

    public int getNumberOfWheels() { return numberOfWheels; }
    public int getNumberOfPassengers() { return numberOfPassengers; }
    public String getMake() { return make; }
    public String getModel() { return model; }


    @Override
    public void driveBackward() {
        System.out.println("car is moving backwards");
    }

    @Override
    public void driveForward() {
        System.out.println("car is moving forward");
    }

    @Override
    public void turnOn() {
        System.out.println("car starting");
    }

    @Override
    public void turnOff() {
        System.out.println("car is shutting down");
    }

    @Override
    public void timeToFullyCharge() {
        System.out.println( "will take a while to fully charge.");
    }


}
