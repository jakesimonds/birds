package Birds;
import java.util.ArrayList;
import java.util.Locale;

public class BirdClass implements Bird  {

    private String name;                        // bird name ie. Grey Parrot, or Black-Capped Chickadee
    private int wingNum;                        // number of wings
    private boolean extinct;                    // whether or not bird is extinct
    private ArrayList<FOOD> foodPreference;     // ArrayList of 2-4 foods bird prefers
    private String birdType;                    // Type of bird ie. Flightless, Pigeon, Bird of Prey, etc.
    private String characteristic;              // a defining characteristic of that bird


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



    // Overloading the constructor (if we can assume a bird is not extinct):
    public BirdClass(String name, int wingNum, ArrayList<FOOD> foodPreference, String characteristic) {
        // check that 2-4 food preferences selected:
        if (foodPreference.size()<2 || foodPreference.size() > 4) {
            throw new IllegalArgumentException("Number of preferred foods must be between 2 - 4.");
        }
        if (wingNum < 0 || wingNum > 3) {
            throw new IllegalArgumentException("Wing number has to be 0-3 (we are inclusive of birds without wing (due to injury) & mutants with three wings");
        }

        this.name = name;
        this.wingNum = wingNum;
        this.extinct = false;
        this.foodPreference = foodPreference;
        this.birdType = "Bird";
        this.characteristic = characteristic;
    }



    // Overloading the constructor (if we can assume a bird has 2 wings):
    public BirdClass(String name, boolean extinct, ArrayList<FOOD> foodPreference, String characteristic) {
        // check that 2-4 food preferences selected:
        if (foodPreference.size()<2 || foodPreference.size() > 4) {
            throw new IllegalArgumentException("Number of preferred foods must be between 2 - 4.");
        }

        this.name = name;
        this.wingNum = 2;
        this.extinct = extinct;
        this.foodPreference = foodPreference;
        this.birdType = "Bird";
        this.characteristic = characteristic;
    }



    // Overloading the constructor (if we can assume a bird has 2 wings and is not extinct):
    public BirdClass(String name, ArrayList<FOOD> foodPreference, String characteristic) {
        // check that 2-4 food preferences selected:
        if (foodPreference.size()<2 || foodPreference.size() > 4) {
            throw new IllegalArgumentException("Number of preferred foods must be between 2 - 4.");
        }

        this.name = name;
        this.wingNum = 2;
        this.extinct = false;
        this.foodPreference = foodPreference;
        this.birdType = "Bird";
        this.characteristic = characteristic;
    }


    //===================================== METHODS =========================================


    // getNumberOfWings() -- returns the number of wings
    @Override
    public int getNumberOfWings() {
        return this.wingNum;
    }

    // getBirdName() -- returns that bird's 'name'
    @Override
    public String getBirdName() {
        return this.name;
    }

    // getBirdType() -- returns that bird's type/classification
    @Override
    public String getBirdType() {
        return this.birdType;
    }

    // getExtinct() -- returns true if the bird is extinct, otherwise false
    @Override
    public boolean getExtinct() {
        return this.extinct;
    }

    // getFooodPreference() -- returns an ArrayList of 2-4 food preferences (ENUM)
    @Override
    public ArrayList<FOOD> getFoodPreference() {
        return this.foodPreference;
    }

    // getFoodPrefString() -- returns a string describing the bird's food preferences
    @Override
    public String getFoodPrefString() {
        ArrayList list = this.getFoodPreference();
        // T left off on purpose, will add it back once rest of string is converted to lowercase
        String res = " eats: ";
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
        res = "This " + this.getBirdName() + res;

        return res;}

    // setBirdType() -- allows one to set the type of bird
    @Override
    public void setBirdType(String birdType) {
        this.birdType = birdType;
    }

    // getBirdCharacteristic() -- returns the defining characteristic of that bird
    @Override
    public String getBirdCharacteristic() {return this.characteristic;}

    // setBirdCharacteristic() -- allows one to set the defining characteristic of that bird
    @Override
    public void setBirdCharacteristic(String birdCharacteristic) {
        this.characteristic = birdCharacteristic;
    }


    @Override
    public String toString() {
        String extinctIsIsnt = "is not";
        if (this.extinct) {
            extinctIsIsnt = "is";
        }
        return "The " + this.name + " is a type of " + this.birdType + ".\n" +
                "This " + this.getBirdName() + " has " + this.wingNum + " wings, and " + extinctIsIsnt + " extinct.\n" +
                "This " + this.name + "'s defining characteristic is: " + this.characteristic + ".\n" +
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