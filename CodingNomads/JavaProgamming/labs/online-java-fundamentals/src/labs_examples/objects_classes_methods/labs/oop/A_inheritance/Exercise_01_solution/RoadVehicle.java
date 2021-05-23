package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_solution;

public class RoadVehicle extends Vehicle {
    private String roadVehicleType;
    private boolean roadLegal;

    public RoadVehicle(){}

    public RoadVehicle(String roadVehicleType, boolean isRoadLegal){
        this.roadVehicleType = roadVehicleType;
        this.roadLegal = isRoadLegal;
    }

    public RoadVehicle(String roadVehicleType,
                       boolean isRoadLegal,
                       int wheels,
                       int topSpeed,
                       int yearOfManufacture,
                       String make,
                       String model) {

        super(
                wheels,
                topSpeed,
                yearOfManufacture,
                make,
                model
        );

        this.roadVehicleType = roadVehicleType;
        this.roadLegal = isRoadLegal;

    }

    public void setRoadVehicleType(String roadVehicleType) { this.roadVehicleType = roadVehicleType; }
    public String getRoadVehicleType() { return roadVehicleType; }

    public void setRoadLegal(boolean roadLegal) { this.roadLegal = roadLegal; }
    public boolean isRoadLegal(boolean b) { return roadLegal; }

}
