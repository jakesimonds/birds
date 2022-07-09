package Birds;
import java.util.ArrayList;

public class Waterfowl extends WaterBird {

  private String description;
  
  // Constructor:
  public Waterfowl(String name, int wingNum, boolean extinct, ArrayList<FOOD> foodPreference, WATER bodyOfWater) {
      super(name, wingNum, extinct, foodPreference, bodyOfWater);
      this.description = "Waterfowl are another classification that live near water sources (fresh or salt).";
    }
}
