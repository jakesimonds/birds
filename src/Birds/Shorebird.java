package Birds;
import java.util.ArrayList;

public class Shorebird extends WaterBird {
  
  // Member fields (?)
  private String name;
  private int numWings;
  // etc.
  
  private String bodyOfWater;
  
  // Constructor:
  public Shorebird(String name, int wingNum, String bodyOfWater) {
      super(name, wingNum);
      
      this.name = name;
      this.wingNum = wingNum;
        
      this.description = "Shorebirds live near water sources including wetlands, freshwater and saltwater shorelands, even the ocean.";
      this.bodyOfWater = bodyOfWater;
    }
  
  // PARENT CLASS WATERBIRD HAS METHOD FOR GETBODYOFWATER... does it need to go in here at all?
}
