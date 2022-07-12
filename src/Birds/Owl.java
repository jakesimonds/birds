package Birds;
import java.util.ArrayList;

public class Owl extends BirdClass {
  private String description;

  public Owl(String name, int wingNum, boolean extinct, ArrayList<FOOD> foodPreference, String characteristic) {
    super(name, wingNum, extinct, foodPreference, characteristic);
    this.description = "Owls are distinguished by the facial disks that frame the eyes and bill.";
    this.setBirdType("Owl");
  }
}
