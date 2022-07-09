package Birds;
import java.util.ArrayList;


public class ConservatoryClass implements Conservatory {

  private int numAviaries;
  private ArrayList<AviaryClass> aviaryList;










  // Guest Lookup (returns which aviary that bird is housed in)
  //       print/return an error message if bird does not exist
  public String guestLookup(BirdClass bird) {
    // TODO : Implement me!
    // iterate through aviaries -> iterate through each aviary's birdList
    // when we find the bird, return its location (that aviary)
    // if not found, print error404: not found
    return null;
  }



  // Print Index
  // List all birds in conservatory in alphabetical order, and their location
  //
  // TODO : compile all aviary birdLists into one master list,
  // sort that list alphabetically by bird name and then print every bird and its respective location
  // TODO should birds have an aviary attribute that stores what aviary they're put in?
  // adding a bird to an aviary could automatically call setAviary for the bird
  //
  // TODO :
  // for each aviary in the conservatory,
  // we can iterate through that aviary's bird list,
  // for each adding "BirdName -- AviaryName" to a master list which can then be sorted alphabetically and printed
  public void printIndex() {
    // TODO : Implement me!
    return;
  }





  // Print Map
  public void printMap() {
    // TODO : Implement me!
    return;
  }


  // Calculate Food
  public String calculateFood() {
    // TODO : Implement me!
    // iterate through each aviary -> iterate through each bird list ->
    //                                            keep a tally for each FOOD enum
    return null;
  }


  // Rescue New Bird
  // FAILS if conservatory is full
  public void rescueBird() {
    // TODO : Implement me!
    // FIRST iterate through existing aviaries to see if there's room/compatibility
    // (for each aviary, check aviaryName.isCompatible(bird))
    // if no space in existing aviaries, and if fewer than 20 aviaries, create a new aviary
    // and designate its type according to the bird we're rescuing (GENERAL, FLIGHTLESS, etc.)
    // Update numAviaries, aviaryList, and within the specific aviary,
    //                                numBirds and birdList as well.
  }

  // (Private) Add Aviary -- Adds a new Aviary to the Conservatory
  // FAILS if there are already 20 aviaries
  private void addAviary() {
    // TODO : Implement me!
    // check whether there are already 20 aviaries,
    // if no, make a new aviary and update numAviaries/aviaryList
  }

  // returns a list of existing aviary objects within the conservatory
  private ArrayList<AviaryClass> getAviaryList() {
    return this.aviaryList;
  }

  // Is Full -- Returns true if the conservatory already has 20 Aviaries, false otherwise
  // TODO: SHOULD THIS CHECK WHETHER THERE ARE 100 BIRDS, OR 20 AVIARIES??
  public boolean isFull() {
    // TODO : Implement me!
    return false;
  }



}
