package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Exercise_01_solution;

import labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_solution.Vehicle;

import javax.management.monitor.MonitorNotification;

public class Controller {
    public static void main(String[] args) {

        Car tesla = new Car();
        PolyMorphExample newExample = new PolyMorphExample(tesla);
//        newExample.testVehicle();

        // =============

        Train dieselTrain = new Train();
        PolyMorphExample trainExample = new PolyMorphExample(dieselTrain);
//        trainExample.testTrain();

        // =============

        Tram firstTram = new Tram();
        PolyMorphExample tramExample = new PolyMorphExample(firstTram);
//        tramExample.testTram();

        // =============

        MotorizedVehicle moto = new MotorizedVehicle() {
            @Override
            public void driveBackward() {
                System.out.println("changing how driving backwards looks like");
            }

            @Override
            public void driveForward() {

            }

            @Override
            public void turnOn() {

            }

            @Override
            public void turnOff() {

            }
        };


        Car newCar = new Car();
        PolyMorphExample motoExample = new PolyMorphExample(moto);


    }
}

class PolyMorphExample {
    private Car car;
    private Train train;
    private Tram tram;
    private MotorizedVehicle motorizedVehicle;


    // constructor
    public PolyMorphExample(Car car) {
        this.car = car;
    }
    public PolyMorphExample(Train train) {
        this.train = train;
    }
    public PolyMorphExample(Tram tram) { this.tram = tram; }
    public PolyMorphExample(MotorizedVehicle motorizedVehicle) { this.motorizedVehicle = motorizedVehicle; }


    // ?????????????
//    public void setMotorizedVehicle(Car updatedCar) {
//        this.car = updatedCar;
//    }

    public void testCar() {
        car.driveBackward();
        car.driveForward();
        car.turnOff();
        car.turnOn();
        car.timeToFullyCharge();
    }

    public void testTrain() {
        train.driveBackward();
        train.driveForward();
        train.turnOff();
        train.turnOn();
        train.timeToFullyCharge();
    }

    public void testTram() {
        tram.driveBackward();
        tram.driveForward();
        tram.turnOff();
        tram.turnOn();
        tram.timeToFullyCharge();
    }
}

