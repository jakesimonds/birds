package Birds;
import java.util.ArrayList;

public class BirdClass implements Bird  {

    private String name;
    private int wingNum;
    //private String birdType;        // these attributes are both kind of specific to children classes --
    //private String description;     // not sure if/how to make them make sense here.
    private boolean extinct;
    private ArrayList<FOOD> foodPreference;


    //===================================== CONSTRUCTORS =========================================


    public BirdClass(String name, int wingNum, boolean extinct, ArrayList<FOOD> foodPreference) {
        // check that 2-4 food preferences selected:
        if (foodPreference.size()<2 || foodPreference.size() > 4) {
            throw new IllegalArgumentException("Number of preferred foods must be between 2 - 4.");
        }

        this.name = name;
        this.wingNum = wingNum;
        this.extinct = extinct;
        this.foodPreference = foodPreference;
    }

    /*


    // Overloading the constructor (if we can assume a bird is not extinct):
    public BirdClass(String name, int wingNum, ArrayList<FOOD> foodPreference) {
        // check that 2-4 food preferences selected:
        if (foodPreference.size()<2 || foodPreference.size() > 4) {
            throw new IllegalArgumentException("Number of preferred foods must be between 2 - 4.");
        }

        this.name = name;
        this.wingNum = wingNum;
        this.extinct = false;
        this.foodPreference = foodPreference;
    }

    // Overloading the constructor (if we can assume a bird has 2 wings):
    public BirdClass(String name, boolean extinct, ArrayList<FOOD> foodPreference) {
        // check that 2-4 food preferences selected:
        if (foodPreference.size()<2 || foodPreference.size() > 4) {
            throw new IllegalArgumentException("Number of preferred foods must be between 2 - 4.");
        }

        this.name = name;
        this.wingNum = 2;
        this.extinct = extinct;
        this.foodPreference = foodPreference;
    }

    // Overloading the constructor (if we can assume a bird has 2 wings and is not extinct):
    public BirdClass(String name, ArrayList<FOOD> foodPreference) {
        // check that 2-4 food preferences selected:
        if (foodPreference.size()<2 || foodPreference.size() > 4) {
            throw new IllegalArgumentException("Number of preferred foods must be between 2 - 4.");
        }

        this.name = name;
        this.wingNum = 2;
        this.extinct = false;
        this.foodPreference = foodPreference;
    }

    */


    //===================================== METHODS =========================================



    @Override
    public int getNumberOfWings() {
        return this.wingNum;
    }


    @Override
    public String getBirdName() {
        return this.name;
    }

    /*
    @Override
    public String getBirdType() {
        return this.birdType;
    }


    @Override
    public String getCharacteristic() {
        return this.description;
    }
    */

    @Override
    public boolean getExtinct() {
        return this.extinct;
    }

    @Override
    public ArrayList<FOOD> getFoodPreference() {
        return null;
    }

    @Override
    public String toString() {
        return "This bird is named: " + this.name + "Wing number = " + this.wingNum + " " + this.foodPreference ;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bird == false) {
            System.out.println("Not a bird!");
            return false;
        }

        Bird other = (Bird) obj;
        //can add food preference once that is built out
        if (this.name == other.getBirdName()) { return true; }
        else {return false; }

    }



}