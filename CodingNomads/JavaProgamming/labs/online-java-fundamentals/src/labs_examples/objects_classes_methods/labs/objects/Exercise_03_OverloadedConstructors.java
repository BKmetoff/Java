package labs_examples.objects_classes_methods.labs.objects;


//  For this exercise please create two classes. The first class is the controller and it will contain the main() method.
//  The second class is a POJO. Just a simple object type class that defines an object. In this POJO, demonstrate
//  at least three overloaded constructors. In the main() method, create at least 3 objects of your POJO class, each using
//  a different constructor.
public class Exercise_03_OverloadedConstructors {
    public static void main(String[] args) {
        System.out.println("controller class");

        SimpleObject objOne = new SimpleObject();
        SimpleObject objTwo = new SimpleObject(34);
        SimpleObject objThree = new SimpleObject(55, "abc");

        System.out.println(objOne);
        System.out.println(objTwo);
        System.out.println(objThree);
    }
}

class SimpleObject {
    int classInt;
    String classStr;

    public SimpleObject() {}

    public SimpleObject(int intParam) {
        this.classInt = intParam;
    }

    public SimpleObject(int intParam, String strParam) {
        this.classInt = intParam;
        this.classStr = strParam;
    }

    @Override
    public String toString() {
        return "SimpleObject{" +
                "classInt=" + classInt +
                ", classStr='" + classStr + '\'' +
                '}';
    }
}