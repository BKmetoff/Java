package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_solution;

public class RailroadVehicle extends Vehicle{
    int numberOfCars;

    public RailroadVehicle(){}

    public RailroadVehicle(int numberOfCars){
        this.numberOfCars = numberOfCars;
    }

    public RailroadVehicle(int numberOfCars, int numberOfWheels){
        super(numberOfWheels);
        this.numberOfCars = numberOfCars;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void addCarsToTrain(int newCars) {
        this.numberOfCars += newCars;
        System.out.println("current number of cars is: " + this.numberOfCars);
    }
}
