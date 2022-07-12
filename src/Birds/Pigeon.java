package Birds;
import java.util.ArrayList;

public class Pigeon extends BirdClass {
  private String description;


  //===================================== CONSTRUCTORS =========================================

  public Pigeon(String name, int wingNum, boolean extinct, ArrayList<FOOD> foodPreference, String characteristic) {
    super(name, wingNum, extinct, foodPreference, characteristic);
    this.description = "Pigeons (or doves) are known for feeding their young \"bird milk\" " +
            "very similar to the milk of mammals. Found all over the world, " +
            "there are several varieties that are extinct.";
    this.setBirdType("Pigeon");
  }



  // if we can assume 2 wings:
  public Pigeon(String name, boolean extinct, ArrayList<FOOD> foodPreference, String characteristic) {
    super(name, extinct, foodPreference, characteristic);
    this.description = "Pigeons (or doves) are known for feeding their young \"bird milk\" " +
            "very similar to the milk of mammals. Found all over the world, " +
            "there are several varieties that are extinct.";
    this.setBirdType("Pigeon");
  }



  // if we can assume not extinct:
  public Pigeon(String name, int wingNum, ArrayList<FOOD> foodPreference, String characteristic) {
    super(name, wingNum, foodPreference, characteristic);
    this.description = "Pigeons (or doves) are known for feeding their young \"bird milk\" " +
            "very similar to the milk of mammals. Found all over the world, " +
            "there are several varieties that are extinct.";
    this.setBirdType("Pigeon");
  }



  // if we can assume both 2 wings and not extinct:
  public Pigeon(String name, ArrayList<FOOD> foodPreference, String characteristic) {
    super(name, foodPreference, characteristic);
    this.description = "Pigeons (or doves) are known for feeding their young \"bird milk\" " +
            "very similar to the milk of mammals. Found all over the world, " +
            "there are several varieties that are extinct.";
    this.setBirdType("Pigeon");
  }

}



