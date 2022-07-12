package Birds;
import java.util.ArrayList;

public class BirdOfPrey extends BirdClass {

    private String description;

    // Constructor
    public BirdOfPrey(String name, int wingNum, boolean extinct, ArrayList<FOOD> foodPreference, String characteristic) {
        super(name, wingNum, extinct, foodPreference, characteristic);
        this.description = "Birds of prey all have sharp, hooked beaks with visible nostrils.";
        this.setBirdType("Bird of Prey");
    }
}