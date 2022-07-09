package Birds;
import java.util.ArrayList;

public class BirdOfPrey extends BirdClass {

    //private String name;
    //private int wingNum;
    private String description;
    //private boolean extinct;
    //private ArrayList<FOOD> foodPreference;
  
  
  
  
    // Constructor with 2 food preferences
    public BirdOfPrey(String name, int wingNum, boolean extinct, ArrayList<FOOD> foodPreference) {
      super(name, wingNum, extinct, foodPreference);
      
      //this.name = name;
      //this.wingNum = wingNum;
      //this.extinct = extinct;
      //this.foodPreference = foodPreference;
      this.description = "Birds of prey all have sharp, hooked beaks with visible nostrils.";
}


