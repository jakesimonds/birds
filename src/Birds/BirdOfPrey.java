package Birds;
import java.util.ArrayList;

public class BirdOfPrey extends BirdClass {

    private String description;

    //===================================== CONSTRUCTORS =========================================

    public BirdOfPrey(String name, int wingNum, boolean extinct, ArrayList<FOOD> foodPreference, String characteristic) {
        super(name, wingNum, extinct, foodPreference, characteristic);
        this.description = "Birds of prey all have sharp, hooked beaks with visible nostrils.";
        this.setBirdType("Bird of Prey");
    }


    // if we can assume 2 wings:
    public BirdOfPrey(String name, boolean extinct, ArrayList<FOOD> foodPreference, String characteristic) {
        super(name, extinct, foodPreference, characteristic);
        this.description = "Birds of prey all have sharp, hooked beaks with visible nostrils.";
        this.setBirdType("Bird of Prey");
    }


    // if we can assume not extinct:
    public BirdOfPrey(String name, int wingNum, ArrayList<FOOD> foodPreference, String characteristic) {
        super(name, wingNum, foodPreference, characteristic);
        this.description = "Birds of prey all have sharp, hooked beaks with visible nostrils.";
        this.setBirdType("Bird of Prey");
    }


    // if we can assume both 2 wings and not extinct:
    public BirdOfPrey(String name, ArrayList<FOOD> foodPreference, String characteristic) {
        super(name, foodPreference, characteristic);
        this.description = "Birds of prey all have sharp, hooked beaks with visible nostrils.";
        this.setBirdType("Bird of Prey");
    }


}