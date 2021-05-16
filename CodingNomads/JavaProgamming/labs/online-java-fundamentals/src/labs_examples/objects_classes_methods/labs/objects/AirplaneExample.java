package labs_examples.objects_classes_methods.labs.objects;

import java.time.LocalDate;

/*
    Following the example in CarExample.java, please use Object Composition to model an Airplane class.
    The Airplane class must be composed of at least 4 other classes (as well as any primitive types you'd like).
    The Airplane class itself should have a fuel capacity (double) variable, as well as a currentFuelLevel variable.

 */


public class AirplaneExample {
    public static void main(String[] args) {

        // instantiate new instances of subclasses
        AirplaneEngine newPlaneEngine = new AirplaneEngine(40000, "AwesomeEngines.inc");
        Crew newPlaneCrew = new Crew(6, 2, 4);
        Luggage newPlaneLuggage = new Luggage(500.20, 300);
        Maintenance newPlaneMaintenance = new Maintenance("OK", "ThatDudeInTheCorner", LocalDate.now());

        // instantiate new instance of master class
        Airplane myPlane = new Airplane(
                2000.50,
                1000,
                800,
                350,
                newPlaneEngine,
                newPlaneCrew,
                newPlaneLuggage,
                newPlaneMaintenance
        );

        System.out.println(myPlane);
    }
}


class Airplane {
//        Following the example in CarExample.java, please use Object Composition to model an Airplane class.
//        The Airplane class must be composed of at least 4 other classes (as well as any primitive types you'd like).
//        The Airplane class itself should have a fuel capacity (double) variable, as well as a currentFuelLevel variable.

        double fuelCapacity;
        double currentFuelLevel;
        double speed;
        int passengers;

        AirplaneEngine airplaneEngine;
        Crew crew;
        Luggage luggage;
        Maintenance maintenance;

    public Airplane(
            double fuelCapacity,
            double currentFuelLevel,
            double speed,
            int passengers,
            AirplaneEngine airplaneEngine,
            Crew crew,
            Luggage luggage,
            Maintenance maintenance) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.speed = speed;
        this.passengers = passengers;
        this.airplaneEngine = airplaneEngine;
        this.crew = crew;
        this.luggage = luggage;
        this.maintenance = maintenance;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", speed=" + speed +
                ", passengers=" + passengers +
                ", airplaneEngine=" + airplaneEngine +
                ", crew=" + crew +
                ", luggage=" + luggage +
                ", maintenance=" + maintenance +
                '}';
    }
}

class AirplaneEngine {
    String brand;
    int horsepower;

    public AirplaneEngine(int horsepower, String brand) {
        this.horsepower = horsepower;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "AirplaneEngine{" +
                "brand='" + brand + '\'' +
                ", horsepower=" + horsepower +
                '}';
    }
}

class Crew {
    int members;
    int pilots;
    int flightAttendants;

    public Crew (int members, int pilots, int flightAttendants) {
        this.members = members;
        this.pilots = pilots;
        this.flightAttendants = flightAttendants;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "members=" + members +
                ", pilots=" + pilots +
                ", flightAttendants=" + flightAttendants +
                '}';
    }
}

class Luggage {
    double capacityInKg;
    double volumeInM3;

    public Luggage(double capacityInKg, double volumeInM3) {
        this.capacityInKg = capacityInKg;
        this.volumeInM3 = volumeInM3;
    }

    @Override
    public String toString() {
        return "Luggage{" +
                "capacityInKg=" + capacityInKg +
                ", volumeInM3=" + volumeInM3 +
                '}';
    }
}

class Maintenance {
    String status;
    String maintenanceOperator;
    LocalDate completedOn;

    public Maintenance(String status, String maintenanceOperator, LocalDate completedOn) {
        this.status = status;
        this.maintenanceOperator = maintenanceOperator;
        this.completedOn = completedOn;
    }

    @Override
    public String toString() {
        return "Maintenance{" +
                "status='" + status + '\'' +
                ", maintenanceOperator='" + maintenanceOperator + '\'' +
                ", completedOn=" + completedOn +
                '}';
    }
}


