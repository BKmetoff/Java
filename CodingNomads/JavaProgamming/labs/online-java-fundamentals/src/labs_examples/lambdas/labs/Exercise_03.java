package labs_examples.lambdas.labs;

import java.util.ArrayList;
import java.util.function.BiFunction;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */

class CompareThemInts {
    static int compare(int a, int b) {
        return Math.max(a, b);
    }
}

interface Display {
    void displayMethod();
}

class Car {
    String brand;

    public Car (String brand) {
        this.brand = brand;
    }

    public void printCarBrand() {
        System.out.println(this.brand);
    }
}

interface CarGenerator {
    Car createCar (String brand);
}

public class Exercise_03 {

    public void printStuff() {
        System.out.println("printing");
    }

    public static void main(String[] args) {

        // 1)
        BiFunction<Integer, Integer, Integer> result = CompareThemInts::compare;
        int callResult = result.apply(4, 5);
        System.out.println(callResult);

        // 2.1)
        Exercise_03 object = new Exercise_03();
        Display display = object :: printStuff;
        display.displayMethod();

        // 2.2)
        Car newCar = new Car("dat car");
        Display displayCar = newCar :: printCarBrand;
        displayCar.displayMethod();

        // 3)
        CarGenerator carGenerator = Car :: new;
        Car bmw = carGenerator.createCar("bmw");
        Car volvo = carGenerator.createCar("volvo");

        ArrayList<Car> listOfCars = new ArrayList<>();
        listOfCars.add(bmw);
        listOfCars.add(volvo);

        for (Car car : listOfCars) {
            car.printCarBrand();
        }
    }
}