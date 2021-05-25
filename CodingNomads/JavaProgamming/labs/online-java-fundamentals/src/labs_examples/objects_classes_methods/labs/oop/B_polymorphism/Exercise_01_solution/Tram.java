package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Exercise_01_solution;

public class Tram extends Train {
    private int passengerCapacity;

    @Override
    public void turnOn() {
        System.out.println("tram staring!");
    }

    @Override
    public void timeToFullyCharge() {
        System.out.println("tram will charge tomorrow");
    }

}
