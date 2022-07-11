package Birds;
import java.util.ArrayList;
import java.util.Collections;


public class ConservatoryClass implements Conservatory {

  private String name;                        // name of the conservatory
  private int numAviaries;                    // The number of aviaries housed in the conservatory
  private ArrayList<AviaryClass> aviaryList;  // A list of aviary objects within the conservatory

  //=================================== CONSTRUCTOR =======================================

  public ConservatoryClass() {
    this.name = "Jake & Nick's Bird Rescue Sanctuary";
    this.numAviaries = 0;
    this.aviaryList = new ArrayList<>();
  }

  //===================================== METHODS =========================================

  // getName() -- returns the name of the conservatory
  public String getName() {
    return this.name;
  }

  // getNumBirds() -- returns the number of birds currently housed in the conservatory
  public int getNumBirds() {
    int numBirds = 0;
    for (int i = 0; i < this.numAviaries; i++) {
      // iterate through every aviary and check numBirds:
      AviaryClass currentAviary = this.aviaryList.get(i);
      numBirds += currentAviary.getSize();
      }
    return numBirds;
  }

  // getNumAviaries returns the number of aviaries currently housed in the conservatory
  public int getNumAviaries() {
    return this.numAviaries;
  }

  // Guest Lookup (returns which aviary that bird is housed in)
  //       print/return an error message if bird does not exist
  public String guestLookup(String birdName) {
    String output = "";
    ArrayList<String> birdsFound = new ArrayList<>();
    // Iterate through all Aviaries in aviaryList:
    for (int i = 0; i < this.numAviaries; i++) {
      // each aviary can now be accessed using   this.aviaryList.get(i)
      AviaryClass currentAviary = this.aviaryList.get(i);
      // Iterate through all Birds in birdList
      for (int j = 0; j < currentAviary.getSize(); j++) {
        // each bird can now be accessed using  currentAviary.getBirdList().get(j)
        BirdClass currentBird = currentAviary.getBirdList().get(j);
        if (currentBird.getBirdName().toUpperCase().equals(birdName.toUpperCase())) {
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
    ArrayList<String> birdIndex = new ArrayList<>();
    // Iterate through all Aviaries in aviaryList:
    for (int i = 0; i < this.numAviaries; i++) {
      // each aviary can now be accessed using   this.aviaryList.get(i)
      AviaryClass currentAviary = this.aviaryList.get(i);
      // Iterate through all Birds in birdList
      for (int j = 0; j < currentAviary.getSize(); j++) {
        // each bird can now be accessed using  currentAviary.getBirdList().get(j)
        BirdClass currentBird = currentAviary.getBirdList().get(j);
        birdIndex.add(currentBird.getBirdName() + "\t--\t" + currentAviary.getAviaryName() + "\n");
      }
    }
    // Sort the list of birds alphabetically:
    Collections.sort(birdIndex);
    // Add each element to a String for output:
    String output = "INDEX OF BIRDS & THEIR AVIARIES:\n\n";
    for (int i = 0; i < birdIndex.size(); i++) {
      output += birdIndex.get(i);
    }
    return output;
  }





  // Print Map
  // print a "map" that lists all aviaries by location, and the birds they house
  public String printMap() {
    ArrayList<String> mapIndex = new ArrayList<>();
    // Iterate through all Aviaries in aviaryList:
    for (int i = 0; i < this.numAviaries; i++) {
      // each aviary can now be accessed using   this.aviaryList.get(i)
      AviaryClass currentAviary = this.aviaryList.get(i);
      // Create a string to store aviary location, name, and birds housed there
      String thisAviaryListing = currentAviary.getAviaryLocation() + " -- " +
              currentAviary.getAviaryName() + " Houses:\n";
      // Iterate through all Birds in that birdList, adding them to the string:
      for (int j = 0; j < currentAviary.getSize(); j++) {
        // each bird can now be accessed using  currentAviary.getBirdList().get(j)
        BirdClass currentBird = currentAviary.getBirdList().get(j);
        thisAviaryListing += "\t" + currentBird.getBirdName() + "\n";
      }
      mapIndex.add(thisAviaryListing);
    }
    // Sort the list of birds alphabetically:
    Collections.sort(mapIndex);
    // Add each String in the sorted list to a single String for output:
    String output = "";
    for (int i = 0; i < mapIndex.size(); i++) {
      output += mapIndex.get(i) + "\n";
    }
    return output;
  }


  // calculateFood() -- print what food needs to be kept & in what quantities
  public String calculateFood() {
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
    String output = "FOOD TYPE \t\t\t\tNUMBER OF BIRDS\n";
    for (int i = 0; i < SIZE; i++) {
      if (foodCounter[i] > 0) {
        if (foodList[i].toString().length() < 10) {
          output += foodList[i].toString() + "\t\t\t\t\t" + foodCounter[i] + "\n";
        } else {
          switch (foodList[i]) {
            case VEGETATION, OTHER_BIRDS:
              output += foodList[i].toString() + "\t\t\t\t" + foodCounter[i] + "\n";
              break;
            case SMALL_MAMMALS:
              output += foodList[i].toString() + "\t\t\t" + foodCounter[i] + "\n";
              break;
            case AQUATIC_INVERTEBRATES:
              output += foodList[i].toString() + "\t" + foodCounter[i] + "\n";
              break;
          }
        }
      }
    }
    return output;
  }


  // Rescue New Bird
  // FAILS if conservatory is full
  public Conservatory rescueBird(Bird bird) {
    // iterate through all existing aviaries:
    for (int i = 0; i < this.numAviaries; i++) {
      // each aviary can now be accessed with this.aviaryList.get(i)
      AviaryClass currentAviary = this.aviaryList.get(i);
      // check whether current aviary is full / compatible with bird:
      if ((!currentAviary.isFull()) && (currentAviary.isCompatible(bird))) {
          // add bird to aviary
          currentAviary.addBird(bird);
          return this;
      }
    }
    // AT THIS POINT, NO EXISTING AVIARIES CAN HOUSE NEW BIRD
    //            ATTEMPT TO CREATE A NEW AVIARY FOR OUR BIRD:
    if (this.aviaryListFull()) {
      // Conservatory is full. No room to add a new aviary.
      throw new IllegalStateException("Conservatory full for this bird type. Cannot add a new " + bird.getBirdName());
    } else {
      // There is room to add a new aviary in the conservatory:
      AviaryClass newAviary = (AviaryClass) this.makeAviary(bird);
      // add the rescued bird to the new aviary:
      newAviary.addBird(bird);
      this.addAviary(newAviary);
      // New aviary containing rescued bird has now been added to the conservatory.
      return this;
    }
  }



  // makeAviary() -- creates & returns a new aviary compatible with the given bird.
  private Aviary makeAviary(Bird bird) {
    // TODO : should this be private or public? Currently private bc it's only ever called
    //  from within rescueBird method in the Conservatory class
    String location = "Campus " + (char)(65 + this.numAviaries);
    String name = "Aviary #" + (this.numAviaries + 1);
    AVIARY_TYPE type;
    // figure out what type of aviary is required for the given bird:
    if (bird instanceof FlightlessBird) {
      // Flightless Bird:
      type = AVIARY_TYPE.FLIGHTLESS;
    } else {
      if (bird instanceof BirdOfPrey) {
        // Bird of Prey
        type = AVIARY_TYPE.BIRDS_OF_PREY;
      } else {
        if (bird instanceof WaterBird) {
          // Water Bird
          type = AVIARY_TYPE.WATER_BIRDS;
        } else {
          type = AVIARY_TYPE.GENERAL;
        }
      }
    }
    AviaryClass newAviary = new AviaryClass(name, type, location);
    return newAviary;
  }


// TODO : now we can use addAviary(makeAviary(bird)) to make & add an aviary for a given bird in rescueBird()


  // (Private) Add Aviary -- Adds a new Aviary to the Conservatory
  // FAILS if there are already 20 aviaries
  private Conservatory addAviary(AviaryClass aviary) {
    // TODO : should this be private or public? Currently private bc it's only ever called
    //  from within rescueBird method in the Conservatory class
    // check whether there are already 20 aviaries,
    // if no, make a new aviary and update numAviaries/aviaryList
    if (this.aviaryListFull()) {
      //Conservatory is full (of aviaries)!
      throw new IllegalStateException("Aviary Capacity is full. Cannot add another Aviary.");
    }
    else {
      // Conservatory has 19 or fewer aviaries:
      // Add the aviary, update numAviaries
      this.aviaryList.add(aviary);
      this.numAviaries ++;
    }
    return this;
  }


  // returns a list of existing aviary objects within the conservatory
  public ArrayList<AviaryClass> getAviaryList() {
    return this.aviaryList;
  }

  // isFUll() -- Returns true if the conservatory already has 100 birds, false otherwise
  public boolean isFull() {
    if (this.getNumBirds() == 100) {
      return true;
    } else { return false; }
  }


  // Is Full -- Returns true if the conservatory already has 20 Aviaries, false otherwise
  public boolean aviaryListFull() {
    if (this.numAviaries == 20) {
      return true;
    } else { return false; }
  }



  @Override
  public String toString() {
    return this.name + " is a Conservatory currently comprised of " +
            this.numAviaries + " Aviaries.\nIt currently houses " +
            this.getNumBirds() + "birds.\n";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Conservatory == false) {
      System.out.println("Not a Conservatory!");
      return false;
    }
    Conservatory other = (Conservatory) obj;
    if (this.name == other.getName()) {
      return true;
    } else {
      return false;
    }
  }










}
