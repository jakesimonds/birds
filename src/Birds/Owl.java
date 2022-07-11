package Birds;
import java.util.ArrayList;

public class Owl extends BirdClass {
  private String description;

  public Owl(String name, int wingNum, boolean extinct, ArrayList<FOOD> foodPreference) {
    super(name, wingNum, extinct, foodPreference);
    this.description = "Owls are distinguished by the facial disks that frame the eyes and bill.";
    setBirdType("Owl");
  }
}
