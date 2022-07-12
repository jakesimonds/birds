package Birds;
import java.util.ArrayList;
import java.util.Locale;

public class WaterBird extends BirdClass {
  
  // Member fields:
  private WATER bodyOfWater;

  //===================================== CONSTRUCTORS =========================================

  public WaterBird(String name, int wingNum, boolean extinct, ArrayList<FOOD> foodPreference, WATER bodyOfWater, String characteristic) {
    super(name, wingNum, extinct, foodPreference, characteristic);
    this.bodyOfWater = bodyOfWater;
  }


  // if we can assume 2 wings:
  public WaterBird(String name, boolean extinct, ArrayList<FOOD> foodPreference, WATER bodyOfWater, String characteristic) {
    super(name, extinct, foodPreference, characteristic);
    this.bodyOfWater = bodyOfWater;
  }


  // if we can assume not extinct:
  public WaterBird(String name, int wingNum, ArrayList<FOOD> foodPreference, WATER bodyOfWater, String characteristic) {
    super(name, wingNum, foodPreference, characteristic);
    this.bodyOfWater = bodyOfWater;
  }


  // if we can assume both 2 wings and not extinct:
  public WaterBird(String name, ArrayList<FOOD> foodPreference, WATER bodyOfWater, String characteristic) {
    super(name, foodPreference, characteristic);
    this.bodyOfWater = bodyOfWater;
  }


  //===================================== METHODS =========================================
  public WATER getBodyOfWater() {
    return this.bodyOfWater;
  }

  @Override
  public String toString() {
    String extinctIsIsnt = "is not";
    if (this.getExtinct()) {
      extinctIsIsnt = "is";
    }
    return "The " + this.getBirdName() + " is a type of " + this.getBirdType() + ".\n" +
            "This " + this.getBirdName() + " has " + this.getNumberOfWings() + " wings, and " + extinctIsIsnt + " extinct.\n" +
            "This " + this.getBirdName() + "'s defining characteristic is: " + this.getBirdCharacteristic() + ".\n" +
            this.getFoodPrefString() + "\n" +
            "This " + this.getBirdName() + " thrives in: " + this.bodyOfWater.toString().toLowerCase(Locale.ROOT) + ".";
  }
  
  
  
  
  
  
}
