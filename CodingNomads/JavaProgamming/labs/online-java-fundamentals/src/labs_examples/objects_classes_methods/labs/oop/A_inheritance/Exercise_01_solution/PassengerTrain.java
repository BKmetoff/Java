package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_solution;

public class PassengerTrain extends RailroadVehicle{
    private int passengerCapacity;
    private int currentPassengerCount;

    public PassengerTrain(){}

    public PassengerTrain(int passengerCapacity){
        this.passengerCapacity = passengerCapacity;
    }

    public PassengerTrain(int passengerCapacity, int topSpeed) {
        super(topSpeed);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() { return passengerCapacity; }
    public void setPassengerCapacity(int passengerCapacity) { this.passengerCapacity = passengerCapacity;}

    public int getCurrentPassengerCount() { return currentPassengerCount; }
    public void setCurrentPassengerCount(int currentPassengerCount) { this.currentPassengerCount =
            currentPassengerCount; }

    public void addCarsToTrain(int newCars, int numberOfPassengersInNewCars) {
        super.addCarsToTrain(newCars);
        currentPassengerCount += numberOfPassengersInNewCars;
        System.out.println("added " + super.getNumberOfCars() + " new cars and " + this.currentPassengerCount + " passengers");
    }
}
