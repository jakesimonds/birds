package Birds;
import java.util.ArrayList;

public class WaterBird extends BirdClass {
  
  // Member fields:
  WATER bodyOfWater;


  public WaterBird(String name, int wingNum, boolean extinct, ArrayList<FOOD> foodPreference, WATER bodyOfWater) {
    super(name, wingNum, extinct, foodPreference);
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
  
  
  
  
  
  
}
