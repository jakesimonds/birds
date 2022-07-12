package Birds;
import java.util.ArrayList;

public class FlightlessBird extends BirdClass {
  private String description;

  public FlightlessBird(String name, int wingNum, boolean extinct, ArrayList<FOOD> foodPreference, String characteristic) {
    super(name, wingNum, extinct, foodPreference, characteristic);
    this.description = "Flightless birds live on the ground and have no (or undeveloped) wings. " +
            "They include the emus, kiwis, and moas. Some (but not all) of these birds are extinct.";
    this.setBirdType("Flightless Bird");
  }
}
