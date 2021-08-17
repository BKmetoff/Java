package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate its
 *          dynamic usage.
 */

class Exercise_01 {
    public static void main(String[] args) {
        GenericClass<Integer, Integer> genClOne = new GenericClass<>(3, 4);
        GenericClass<String, Double> genClTwo = new GenericClass<>("str", 3.4);
    }
}

class GenericClass<T, V> {
    T varT;
    V varV;

    public GenericClass(){}

    public GenericClass(T varT, V varV){
        this.varT = varT;
        this.varV = varV;
    }

    public T getVar1() {
        return varT;
    }

    public V getVar2() {
        return varV;
    }

    public void setVar1(T varT) {
        this.varT = varT;
    }

    public void setVar2(V varV) {
        this.varV = varV;
    }
}