package labs_examples.static_nonstatic.labs;

public class Ex_01 {
    public static void main(String[] args) {
        // 1) A static method calling another static method in the same class
        ClassOne.staticMethod1();

        // 2) A static method calling a non-static method in the same class
        ClassOne.staticCallingNonStaticInAnotherClass();

        // 3) A static method calling a static method in another class
        ClassOne.staticCallingStaticInAnotherClass();

        // 4) A static method calling a non-static method in another class
        ClassOne.staticCallNonStaticInAnotherClass();

        // 5) A non-static method calling a non-static method in the same class
        ClassOne newClassOne = new ClassOne();
        newClassOne.nonStaticCallNonStaticInSameClass();

        // 6) A non-static method calling a non-static method in another class
        newClassOne.nonStaticCallNonStaticInAnotherClass();

        // 7) A non-static method calling a static method in the same class
        newClassOne.nonStaticCallStaticInSameClass();

        // 8) A non-static method calling a static method in another class
        newClassOne.nonStaticCallStaticInAnotherClass();
    }
}
