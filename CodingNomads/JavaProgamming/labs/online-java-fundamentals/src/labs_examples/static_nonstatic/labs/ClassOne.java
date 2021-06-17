package labs_examples.static_nonstatic.labs;

public class ClassOne {
    static void staticMethod2(boolean calledByStatic) {
        if (calledByStatic) {
            System.out.println("static calling static in the same class");
        } else {
            System.out.println("non-static calling static in the same class");
        }
    }

    public void nonStaticMethod(String toPrint) {
        System.out.println(toPrint);
    }

    // 1) A static method calling another static method in the same class
    static void staticMethod1() {
        staticMethod2(true);
    }

    // 2) A static method calling a non-static method in the same class
    static void staticCallingNonStaticInAnotherClass() {
        ClassOne newClassOne = new ClassOne();
        newClassOne.nonStaticMethod("static calling non-static in the same class");
    }

    // 3) A static method calling a static method in another class
    public static void staticCallingStaticInAnotherClass() {
        ClassTwo.staticMethodInOtherClass("static calling static in another class");
    }

    // 4) A static method calling a non-static method in another class
    static void staticCallNonStaticInAnotherClass(){
        ClassTwo newClassTwo = new ClassTwo();
        newClassTwo.nonStaticMethodInOtherClass("static calling a non-static in another class");
    }

    // 5) A non-static method calling a non-static method in the same class
    public void nonStaticCallNonStaticInSameClass () {
        nonStaticMethod("non-static calling a non-static in same class");
    }

    // 6) A non-static method calling a non-static method in another class
    public void nonStaticCallNonStaticInAnotherClass() {
        ClassTwo newClassTwo = new ClassTwo();
        newClassTwo.nonStaticMethodInOtherClass("non-static calling a non-static in another class");
    }

    // 7) A non-static method calling a static method in the same class
    public void nonStaticCallStaticInSameClass () {
        staticMethod2(false);
    }

    // 8) A non-static method calling a static method in another class
    public void nonStaticCallStaticInAnotherClass() {
        ClassTwo.staticMethodInOtherClass("non-static calling a static in another class");
    }
}