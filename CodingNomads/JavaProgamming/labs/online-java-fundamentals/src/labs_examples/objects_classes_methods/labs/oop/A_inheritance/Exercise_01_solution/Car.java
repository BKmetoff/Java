package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_solution;

public class Car extends RoadVehicle {
    private int numberOfPassengers;
    private String carType; // sedan, etc...

    public Car(){
        super();
    }

    public Car(String type, boolean isRoadLegal, int numberOfPassengers, String carType){
        super(type, isRoadLegal);
        setNumberOfPassengers(numberOfPassengers);
        setCarType(carType);
    }

    public Car(String type,
               boolean isRoadLegal,
               int numberOfPassengers,
               String carType,
               int wheels,
               int topSpeed,
               int yearOfManufacture,
               String make,
               String model){

        super(
                type,
                isRoadLegal,
                wheels,
                topSpeed,
                yearOfManufacture,
                make,
                model
        );

        setNumberOfPassengers(numberOfPassengers);
        setCarType(carType);
    }


    public void setNumberOfPassengers(int numberOfPassengers) { this.numberOfPassengers = numberOfPassengers; }

    public void setCarType(String carType) { this.carType = carType; }


    @Override
    public String toString() {
        return "Car{" +
                "numberOfPassengers=" + numberOfPassengers +
                ", carType='" + carType + '\'' +
                ", roadVehicleType='" + super.getRoadVehicleType() + '\'' +
                ", isRoadLegal='" + super.isRoadLegal(true) + '\'' +
                '}';
    }
}
