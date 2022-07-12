package Birds;
import java.util.ArrayList;

public class Owl extends BirdClass {
  private String description;

  //===================================== CONSTRUCTORS =========================================
  public Owl(String name, int wingNum, boolean extinct, ArrayList<FOOD> foodPreference, String characteristic) {
    super(name, wingNum, extinct, foodPreference, characteristic);
    this.description = "Owls are distinguished by the facial disks that frame the eyes and bill.";
    this.setBirdType("Owl");
  }

  // if we can assume 2 wings:
  public Owl(String name, boolean extinct, ArrayList<FOOD> foodPreference, String characteristic) {
    super(name, extinct, foodPreference, characteristic);
    this.description = "Owls are distinguished by the facial disks that frame the eyes and bill.";
    this.setBirdType("Owl");
  }

  // if we can assume not extinct:
  public Owl(String name, int wingNum, ArrayList<FOOD> foodPreference, String characteristic) {
    super(name, wingNum, foodPreference, characteristic);
    this.description = "Owls are distinguished by the facial disks that frame the eyes and bill.";
    this.setBirdType("Owl");
  }


  // if we can assume both 2 wings and not extinct:
  public Owl(String name, ArrayList<FOOD> foodPreference, String characteristic) {
    super(name, foodPreference, characteristic);
    this.description = "Owls are distinguished by the facial disks that frame the eyes and bill.";
    this.setBirdType("Owl");
  }






}
