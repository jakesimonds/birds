package Birds;
import java.util.ArrayList;
import java.util.Locale;

public class BirdClass implements Bird  {

    private String name;
    private int wingNum;
    //private String birdType;        // these attributes are both kind of specific to children classes --
    //private String description;     // not sure if/how to make them make sense here.
    private boolean extinct;
    private ArrayList<FOOD> foodPreference;
    private String birdType;

    private String characteristic;


    //===================================== CONSTRUCTORS =========================================


    public BirdClass(String name, int wingNum, boolean extinct, ArrayList<FOOD> foodPreference, String characteristic) {
        // check that 2-4 food preferences selected:
        if (foodPreference.size()<2 || foodPreference.size() > 4) {
            throw new IllegalArgumentException("Number of preferred foods must be between 2 - 4.");
        }
        if (wingNum < 0 || wingNum > 3) {
            throw new IllegalArgumentException("Wing number has to be 0-3 (we are inclusive of birds without wing (due to injury) & mutants with three wings");
        }

        this.name = name;
        this.wingNum = wingNum;
        this.extinct = extinct;
        this.foodPreference = foodPreference;
        this.birdType = "Bird";
        this.characteristic = characteristic;
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


    @Override
    public String getBirdType() {
        return this.birdType;
    }


    @Override
    public boolean getExtinct() {
        return this.extinct;
    }

    @Override
    public ArrayList<FOOD> getFoodPreference() {
        return this.foodPreference;
    }

    @Override
    public String getFoodPrefString() {
        ArrayList list = this.getFoodPreference();
        // T left off on purpose, will add it back once rest of string is converted to lowercase
        String res = "his bird eats: ";
        //iterate through this.foodPreference, adding to string the foods the bird eats
        int i;
        //adding comma in between all but last item
        for (i=0;i < list.size() - 1; i++){
            res = res + list.get(i) + ", ";
        }
        // adding and before last item & period
        res = res + "and " + list.get(i) + ".";
        //setting string to lowercase and then adding capital T
        res = res.toLowerCase(Locale.ROOT);
        res = "T" + res;

        return res;}

    @Override
    public void setBirdType(String birdType) {
        this.birdType = birdType;
    }

    @Override
    public String getBirdCharacteristic() {return this.characteristic;}

    @Override
    public void setBirdCharacteristic(String birdCharacteristic) {
        this.characteristic = birdCharacteristic;
    }


    @Override
    public String toString() {
        return "This " + this.birdType + " is named: " + this.name + ".\n" +
                "Wing number = " + this.wingNum + ".\n" +
                "Defining characteristic: " + this.characteristic + ".\n" +
                "Extinct = " + this.getExtinct() + ".\n" +
                this.getFoodPrefString() ;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bird == false) {
            System.out.println("Not a bird!");
            return false;
        }

        Bird other = (Bird) obj;
        //can add food preference once that is built out
        if (this.name == other.getBirdName() && this.extinct == other.getExtinct()
                && this.birdType == other.getBirdType() && this.wingNum == other.getNumberOfWings() ) {return true; }
        else {return false; }

    }



}