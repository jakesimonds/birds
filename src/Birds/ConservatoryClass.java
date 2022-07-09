package Birds;
import java.util.ArrayList;
import java.util.Collections;


public class ConservatoryClass implements Conservatory {

  private int numAviaries;                    // The number of aviaries housed in the conservatory
  private ArrayList<AviaryClass> aviaryList;  // A list of aviary objects within the conservatory




  // Guest Lookup (returns which aviary that bird is housed in)
  //       print/return an error message if bird does not exist
  public String guestLookup(String birdName) {
    String output = "";
    ArrayList<String> birdsFound = new ArrayList<String>();
    // Iterate through all Aviaries in aviaryList:
    for (int i = 0; i < this.numAviaries; i++) {
      // each aviary can now be accessed using   this.aviaryList.get(i)
      AviaryClass currentAviary = this.aviaryList.get(i);
      // Iterate through all Birds in birdList
      for (int j = 0; j < currentAviary.getSize(); j++) {
        // each bird can now be accessed using  currentAviary.getBirdList().get(j)
        BirdClass currentBird = currentAviary.getBirdList().get(j);
        if (currentBird.getBirdName().toUpperCase() == birdName.toUpperCase()) {
          // it's a match! record current bird & aviary in birdsFound :
          // check that aviary isn't already in the list:
          if (!birdsFound.contains(currentAviary.getAviaryName())) {
            birdsFound.add(currentAviary.getAviaryName());
          }
        }
      }
    }
    if (birdsFound.size() == 0) {
      // Error 404 : Bird not found
      return "Error 404: Bird not found.\n" + birdName + " does not exist in the conservatory.";
    }
    else {
      // IF ONE BIRD FOUND:
      if (birdsFound.size() == 1) {
        output += birdName + " was found in the following Aviary:\n";
      }
      else {
        // IF MORE THAN ONE BIRD FOUND
        output += birdName + " was found in the following Aviaries:\n";
      }
      for (int i = 0; i < birdsFound.size(); i++) {
        output += birdsFound.get(i) + "\n";
      }
    }
    return output;
  }



  // printIndex() --
  // List all birds in conservatory in alphabetical order, and their location
  public String printIndex() {
    ArrayList<String> birdIndex = new ArrayList<String>();
    // Iterate through all Aviaries in aviaryList:
    for (int i = 0; i < this.numAviaries; i++) {
      // each aviary can now be accessed using   this.aviaryList.get(i)
      AviaryClass currentAviary = this.aviaryList.get(i);
      // Iterate through all Birds in birdList
      for (int j = 0; j < currentAviary.getSize(); j++) {
        // each bird can now be accessed using  currentAviary.getBirdList().get(j)
        BirdClass currentBird = currentAviary.getBirdList().get(j);
        birdIndex.add(currentBird.getBirdName() + " -- " + currentAviary.getAviaryName() + "\n");
      }
    }
    // Sort the list of birds alphabetically:
    Collections.sort(birdIndex);
    // Add each element to a String for output:
    String output = "";
    for (int i = 0; i < birdIndex.size(); i++) {
      output += birdIndex.get(i) + "\n";
    }
    return output;
  }





  // Print Map
  // print a "map" that lists all aviaries by location, and the birds they house
  //
  // iterate through each aviary, add to ArrayList "locationName - aviaryName - bird1, bird2, bird3, etc. "
  // then sort list alphabetically and add all to String for output
  public void printMap() {
    // TODO : Implement me!
    return;
  }


  // calculateFood() print what food needs to be kept & in what quantities
  public String calculateFood() {
    // iterate through each aviary -> iterate through each bird list ->
    //                                            keep a tally for each FOOD enum
    FOOD[] foodList = {
            FOOD.AQUATIC_INVERTEBRATES,
            FOOD.BERRIES,
            FOOD.BUDS,
            FOOD.EGGS,
            FOOD.FISH,
            FOOD.FRUIT,
            FOOD.INSECTS,
            FOOD.LARVAE,
            FOOD.NUTS,
            FOOD.OTHER_BIRDS,
            FOOD.SEEDS,
            FOOD.SMALL_MAMMALS,
            FOOD.VEGETATION
            };
    int[] foodCounter = {0,0,0,0,0,0,0,0,0,0,0,0,0};
    final int SIZE = 13;

    // Iterate through all Aviaries in aviaryList:
    for (int i = 0; i < this.numAviaries; i++) {
      // each aviary can now be accessed using   this.aviaryList.get(i)
      AviaryClass currentAviary = this.aviaryList.get(i);
      // Iterate through all Birds in birdList
      for (int j = 0; j < currentAviary.getSize(); j++) {
        // each bird can now be accessed using  currentAviary.getBirdList().get(j)
        BirdClass currentBird = currentAviary.getBirdList().get(j);
        // iterate through foodList, checking whether each element is in currentBird.getFoodPreference()
        for (int k = 0; k < SIZE; k++) {
          if (currentBird.getFoodPreference().contains(foodList[k])) {
            // add one to the foodCounter at the given index
            foodCounter[k] ++;
          }
        }
      }
    }
    String output = "FOOD TYPE \t\t NUMBER OF BIRDS\n";
    for (int i = 0; i < SIZE; i++) {
      if (foodCounter[i] > 0) {
        output += foodList[i].toString() + "\t\t" + foodCounter[i] + "\n";
      }
    }
    return output;
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
  private void addAviary(AviaryClass aviary) {
    // check whether there are already 20 aviaries,
    // if no, make a new aviary and update numAviaries/aviaryList
    if (this.numAviaries == 20) {
      //Conservatory is full (of aviaries)!
      throw new IllegalStateException("Conservatory is full. Cannot add another Aviary.");
    }
    else {
      // Conservatory has 19 or fewer aviaries:
      // Add the aviary, update numAviaries
      this.aviaryList.add(aviary);
      this.numAviaries ++;
    }
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
