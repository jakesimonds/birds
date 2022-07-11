package Birds;
import java.util.ArrayList;

public class WaterBird extends BirdClass {
  
  // Member fields:
  WATER bodyOfWater;


  public WaterBird(String name, int wingNum, boolean extinct, ArrayList<FOOD> foodPreference, WATER bodyOfWater, String characteristic) {
    super(name, wingNum, extinct, foodPreference, characteristic);
    this.bodyOfWater = bodyOfWater;
  }
/*
  public WaterBird(String name, int wingNum, ArrayList<FOOD> foodPreference, WATER bodyOfWater) {
    super(name, wingNum, foodPreference);
    this.bodyOfWater = bodyOfWater;

  }

  public WaterBird(String name, boolean extinct, ArrayList<FOOD> foodPreference, WATER bodyOfWater) {
    super(name, extinct, foodPreference);
    this.bodyOfWater = bodyOfWater;
  }

  public WaterBird(String name, ArrayList<FOOD> foodPreference, WATER bodyOfWater) {
    super(name, foodPreference);
    this.bodyOfWater = bodyOfWater;
  }
*/



  // Methods:
  public WATER getBodyOfWater() {
    return this.bodyOfWater;
  }

  @Override
  public String toString() {
    return "This " + this.getBirdType() + " is named: " + this.getBirdName() + ".\n" +
            "Wing number = " + this.getNumberOfWings() + ".\n" +
            "Defining characteristic: " + this.getBirdCharacteristic() + ".\n" +
            "Extinct = " + this.getExtinct() + ".\n" +
            this.getFoodPrefString() + "\n" +
            "This bird thrives in : " + this.bodyOfWater;

  }
  
  
  
  
  
  
}
