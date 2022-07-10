package Birds;
import java.util.ArrayList;

public class Pigeon extends BirdClass {
  private String description;
  //private String birdType;

  public Pigeon(String name, int wingNum, boolean extinct, ArrayList<FOOD> foodPreference) {
    super(name, wingNum, extinct, foodPreference);
    this.description = "Pigeons (or doves) are known for feeding their young \"bird milk\" " +
            "very similar to the milk of mammals. Found all over the world, " +
            "there are several varieties that are extinct.";
    setBirdType("Pigeon");
  }

  @Override
  public String toString(){
    return this.getBirdName() + " " + this.getNumberOfWings() + " " + this.getFoodPreference() + " " + this.description;
  }
}


