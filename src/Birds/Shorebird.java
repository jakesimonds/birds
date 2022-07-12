package Birds;
import java.util.ArrayList;

public class Shorebird extends WaterBird {
  public final String description;

  //===================================== CONSTRUCTORS =========================================

  public Shorebird(String name, int wingNum, boolean extinct, ArrayList<FOOD> foodPreference, WATER bodyOfWater, String characteristic) {
      super(name, wingNum, extinct, foodPreference, bodyOfWater, characteristic);
      this.description =
              "Shorebirds live near water sources including wetlands, " +
                      "freshwater and saltwater shorelands, even the ocean.";
      this.setBirdType("Shorebird");
    }


    // if we can assume 2 wings:
    public Shorebird(String name, boolean extinct, ArrayList<FOOD> foodPreference, WATER bodyOfWater, String characteristic) {
      super(name, extinct, foodPreference, bodyOfWater, characteristic);
      this.description =
              "Shorebirds live near water sources including wetlands, " +
                      "freshwater and saltwater shorelands, even the ocean.";
      this.setBirdType("Shorebird");
    }


    // if we can assume not extinct:
    public Shorebird(String name, int wingNum, ArrayList<FOOD> foodPreference, WATER bodyOfWater, String characteristic) {
      super(name, wingNum, foodPreference, bodyOfWater, characteristic);
      this.description =
              "Shorebirds live near water sources including wetlands, " +
                      "freshwater and saltwater shorelands, even the ocean.";
      this.setBirdType("Shorebird");
    }


    // if we can assume both 2 wings and not extinct:
    public Shorebird(String name, ArrayList<FOOD> foodPreference, WATER bodyOfWater, String characteristic) {
      super(name, foodPreference, bodyOfWater, characteristic);
      this.description =
              "Shorebirds live near water sources including wetlands, " +
                      "freshwater and saltwater shorelands, even the ocean.";
      this.setBirdType("Shorebird");
    }

}
