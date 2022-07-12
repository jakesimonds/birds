package Birds;
import java.util.ArrayList;

public class Waterfowl extends WaterBird {


  private String description;

  //===================================== CONSTRUCTORS =========================================
  public Waterfowl(String name, int wingNum, boolean extinct, ArrayList<FOOD> foodPreference, WATER bodyOfWater, String characteristic) {
      super(name, wingNum, extinct, foodPreference, bodyOfWater, characteristic);
      this.description = "Waterfowl are another classification that live near water sources (fresh or salt).";
      this.setBirdType("Waterfowl");
    }


    // if we can assume 2 wings:
    public Waterfowl(String name,boolean extinct, ArrayList<FOOD> foodPreference, WATER bodyOfWater, String characteristic) {
      super(name, extinct, foodPreference, bodyOfWater, characteristic);
      this.description = "Waterfowl are another classification that live near water sources (fresh or salt).";
      this.setBirdType("Waterfowl");
    }


    // if we can assume not extinct:
    public Waterfowl(String name, int wingNum, ArrayList<FOOD> foodPreference, WATER bodyOfWater, String characteristic) {
      super(name, wingNum, foodPreference, bodyOfWater, characteristic);
      this.description = "Waterfowl are another classification that live near water sources (fresh or salt).";
      this.setBirdType("Waterfowl");
    }


    // if we can assume both 2 wings and not extinct:
    public Waterfowl(String name, ArrayList<FOOD> foodPreference, WATER bodyOfWater, String characteristic) {
      super(name, foodPreference, bodyOfWater, characteristic);
      this.description = "Waterfowl are another classification that live near water sources (fresh or salt).";
      this.setBirdType("Waterfowl");
    }





}
