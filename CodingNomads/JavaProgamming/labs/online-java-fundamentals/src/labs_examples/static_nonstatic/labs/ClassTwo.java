package labs_examples.static_nonstatic.labs;

public class ClassTwo {
    public static void staticMethodInOtherClass(String toPrint) {
        System.out.println(toPrint);
    }

    public void nonStaticMethodInOtherClass(String toPrint) {
        System.out.println(toPrint);
    }


}
