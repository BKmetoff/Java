package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Exercise_01_solution;

public interface MotorizedVehicle {
    void driveBackward();
    void driveForward();
    void turnOn();
    void turnOff();

    default void timeToFullyCharge() {
        System.out.println("Not an electric vehicle");
    }
}
