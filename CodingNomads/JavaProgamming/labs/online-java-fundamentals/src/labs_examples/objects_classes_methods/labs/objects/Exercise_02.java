package labs_examples.objects_classes_methods.labs.objects;
import java.util.ArrayList;

/*
    Please demonstrate Object association by creating at least two POJOs and a Controller class. The Controller
    class will contain the main() method. In the main() create an object of each POJO you just created and associate
    the two together. (This is easier than it sounds. Refer to the Object Association documentation if you're not sure.)
 */


// controller class
public class Exercise_02 {
    public static void main(String[] args) {

        Guitar chapman = new Guitar();
        Guitar ibanez = new Guitar();
        ArrayList<Guitar> myGuitars = new ArrayList<>();
        Guitarist thatsMe = new Guitarist();

        chapman.setBrand("Chapman");
        chapman.setNumOfStrings(6);

        ibanez.setBrand("Ibanez");
        ibanez.setNumOfStrings(8);

        myGuitars.add(chapman);
        myGuitars.add(ibanez);

        thatsMe.setName("Bobo");
        thatsMe.setGuitars(myGuitars);

        System.out.println(thatsMe.getName() + " has " + thatsMe.getNumberOfGuitars() + " guitars");
        System.out.println("my guitars are " + thatsMe.getGuitars().toString());

    }
}

class Guitarist {
    private String name;
    private ArrayList<Guitar> guitars;

    public void setName(String name) { this.name = name; }
    public void setGuitars(ArrayList<Guitar> guitars) { this.guitars = guitars; }

    public String getName() { return name; }
    public ArrayList<Guitar> getGuitars() { return guitars; }
    public int getNumberOfGuitars() { return guitars.toArray().length; }

}

class Guitar {
    private String brand;
    private int numOfStrings;

    public String getBrand() {return brand;}
    public int getNumOfStrings() { return numOfStrings; }

    public void setBrand (String brand) { this.brand = brand; }
    public void setNumOfStrings (int strings) { this.numOfStrings = strings; }

    @Override
    public String toString() {
        return "Guitar{" +
                "brand='" + brand + '\'' +
                ", numOfStrings=" + numOfStrings +
                '}';
    }
}






