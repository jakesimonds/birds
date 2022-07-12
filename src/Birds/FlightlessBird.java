package Birds;
import java.util.ArrayList;

public class FlightlessBird extends BirdClass {
  public final String description;

  //===================================== CONSTRUCTORS =========================================

  public FlightlessBird(String name, int wingNum, boolean extinct, ArrayList<FOOD> foodPreference, String characteristic) {
    super(name, wingNum, extinct, foodPreference, characteristic);
    this.description = "Flightless birds live on the ground and have no (or undeveloped) wings. " +
            "They include the emus, kiwis, and moas. Some (but not all) of these birds are extinct.";
    this.setBirdType("Flightless Bird");
  }


  // if we can assume 2 wings:
  public FlightlessBird(String name, boolean extinct, ArrayList<FOOD> foodPreference, String characteristic) {
    super(name, extinct, foodPreference, characteristic);
    this.description = "Flightless birds live on the ground and have no (or undeveloped) wings. " +
            "They include the emus, kiwis, and moas. Some (but not all) of these birds are extinct.";
    this.setBirdType("Flightless Bird");
  }


  // if we can assume not extinct:
  public FlightlessBird(String name, int wingNum, ArrayList<FOOD> foodPreference, String characteristic) {
    super(name, wingNum, foodPreference, characteristic);
    this.description = "Flightless birds live on the ground and have no (or undeveloped) wings. " +
            "They include the emus, kiwis, and moas. Some (but not all) of these birds are extinct.";
    this.setBirdType("Flightless Bird");
  }


  // if we can assume both 2 wings and not extinct:
  public FlightlessBird(String name, ArrayList<FOOD> foodPreference, String characteristic) {
    super(name, foodPreference, characteristic);
    this.description = "Flightless birds live on the ground and have no (or undeveloped) wings. " +
            "They include the emus, kiwis, and moas. Some (but not all) of these birds are extinct.";
    this.setBirdType("Flightless Bird");
  }

}
