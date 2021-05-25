package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_solution;


//        1) Create at least 5 classes that demonstrate an labs_examples.inheritance hierachy. The depth of the hiearchy must be at least 3. Meaning:
//        A extends B, B extends C. Classes A, B, and C define an labs_examples.inheritance hierachy with a depth of 3. Create a real-world
//        labs_examples.inheritance hierarchy. For instance you could create an labs_examples.inheritance hiearchy using animals, or food, or the solar system,
//        or stores, restaurants, adventures, and really anything else you can imagine. Have some fun with it. Try to challenge
//        yourself.
//
//        2) Once you've created this hierarchy, demonstrate the use of non-default constructors in the parent classes. Meaning,
//        use the super(arg1, arg2, ...) command from a subclass to invoke a parameterized constructor in the parent class. Do this
//        at least once, several times over would be better.
//
//        3) Create at least three methods that override a method in one or more parent classes.
//
//        4) Create a controller class/method that will create objects of your hiearchy and demonstrate how you use this labs_examples.inheritance
//        hierarchy. Demonstrate that your subclasses have set the variables in the parent classes, that you have called the parameterized
//        super constructors from sub-classes, that you are indeed overriding methods.


public class Controller {
    public static void main(String[] args) {

        // instance of car object
        Car ford = new Car() {
        };
        ford.setCarType("sedan");
        ford.setNumberOfPassengers(4);
        ford.setRoadVehicleType("passenger vehicle");
        ford.setRoadLegal(true);

        // instance of car object + road vehicle object
        Car superBeachBuggy = new Car("beach buggy", false, 1, "buggy");


        // instance of car object + road vehicle object + MotorizedVehicle object
        Car bigAssTruck = new Car(
                "super truck",
                true,
                2,
                "cargo vehicle",
                18,
                120,
                1995,
                "GM",
                "GM Big Ass Truck"
        );

//        System.out.println("ford: " + ford);
//        System.out.println("buggy: " + superBeachBuggy);
//        System.out.println(bigAssTruck);


        // ===============

        // pass param to grandparent
        CargoTrain cargoTrainOne = new CargoTrain(4);
        cargoTrainOne.setMake("cargo train co.");

        // pass params to parent
        CargoTrain cargoTrainTwo = new CargoTrain(500, "coal");
        cargoTrainTwo.numberOfCars = 13;

        // pass numberOfCars to parent, numberOfWheels to grandparent:
        CargoTrain cargoTrainThree = new CargoTrain(5, 400);
//        System.out.println(cargoTrainThree.getNumberOfCars() + " " + cargoTrainOne.getNumberOfCars());


        // default constructor
        PassengerTrain passengerTrainOne = new PassengerTrain();
        passengerTrainOne.setPassengerCapacity(1200);

        // custom constructor
        PassengerTrain passengerTrainTwo = new PassengerTrain(1200);

        // custom constructor, pass arg to grandparent
        PassengerTrain passengerTrainThree = new PassengerTrain(1500, 90);
        passengerTrainThree.addCarsToTrain(3);
        passengerTrainThree.setCurrentPassengerCount(40);
        System.out.println(passengerTrainThree.getCurrentPassengerCount());
        passengerTrainThree.addCarsToTrain(4, 120);
    }
}
