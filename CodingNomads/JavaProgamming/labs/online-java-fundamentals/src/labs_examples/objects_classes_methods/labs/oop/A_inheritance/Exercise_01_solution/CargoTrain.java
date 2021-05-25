package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_solution;

public class CargoTrain extends RailroadVehicle {
    private int cargoCapacity;
    private String cargoType;

    public CargoTrain(){}

    public CargoTrain(int cargoCapacity, String cargoType){
        this.cargoCapacity = cargoCapacity;
        this.cargoType = cargoType;
    }

    public CargoTrain(int numberOfCars){
        super(numberOfCars);
    }

    public CargoTrain(int numberOfCars, int numberOfWheels){
        super(numberOfCars, numberOfWheels);
    }


}
