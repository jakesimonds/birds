package Birds;
import java.util.ArrayList;

public class Shorebird extends WaterBird {
  private String description;
  // Constructor:
  public Shorebird(String name, int wingNum, boolean extinct, ArrayList<FOOD> foodPreference, WATER bodyOfWater) {
      super(name, wingNum, extinct, foodPreference, bodyOfWater);
      this.description =
              "Shorebirds live near water sources including wetlands, " +
                      "freshwater and saltwater shorelands, even the ocean.";
      this.birdType = "Shorebird";
    }
}
