package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Exercise_01_solution;

public class Train implements MotorizedVehicle {

    private int numberOfCars;

    public void setNumberOfCars(int numberOfCars) { this.numberOfCars = numberOfCars; }


    @Override
    public void driveBackward() {
        System.out.println("train is moving backwards");
    }

    @Override
    public void driveForward() {
        System.out.println("train is moving forward");
    }

    @Override
    public void turnOn() {
        System.out.println("train is starting");
    }

    @Override
    public void turnOff() {
        System.out.println("train is shutting down");
    }
}
