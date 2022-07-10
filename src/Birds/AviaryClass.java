package Birds;
import java.util.ArrayList;


public class AviaryClass implements Aviary {

  // Member Fields:
  private String aviaryName;              // name of aviary
                                          // TODO : is this useful?
  private int numBirds;                   // number of birds stored in it
  private ArrayList<BirdClass> birdList;  // list of the bird objects stored there
  private AVIARY_TYPE aviaryType;         // type of bird(s) stored there
  private String aviaryLocation;          // location of this aviary
                                          // TODO : is this useful?



  //===================================== CONSTRUCTORS =========================================
  public AviaryClass(String aviaryName, AVIARY_TYPE aviaryType, String aviaryLocation) {
    this.aviaryName = aviaryName;
    this.aviaryType = aviaryType;
    this.aviaryLocation = aviaryLocation;
    // initialized with 0 birds:
    this.numBirds = 0;
    this.birdList = new ArrayList<>();
  }
  // TODO : Should there be other constructors?
  //  Or does every aviary need to be initialized with name/type/location?
  //  (leaning towards the latter)

  //===================================== METHODS =========================================

  // getBirdList() -- private method which returns a
  //          list of the bird objects in that aviary
  public ArrayList<BirdClass> getBirdList(){
    return this.birdList;
  }

  public String getAviaryName() {
    return this.aviaryName;
  }

  // ACCESSOR METHODS

  // getAviaryLocation returns a string for that aviary's location
  public String getAviaryLocation(){
    // TODO : implement me!
    return null;
  }

  // getSize returns the number of birds in the aviary
  public int getSize() {
    return this.numBirds;
  }

  // getType returns the type of birds stored in the aviary (from AVIARY_TYPE enum)
  public AVIARY_TYPE getType() {
    return this.aviaryType;
  }

  // Add Bird (fails if bird is extinct, if there is no room for the bird, bird is wrong type)
  // UPDATES numOfBirds
  @Override
  public Aviary addBird(Bird bird) {
    if (this.numBirds == 5) {
      throw new IllegalStateException("Cannot add a bird to a full aviary.");
    } else {
      // There is room to add another bird.
      // Check whether bird is compatible with this aviary:
      if (!this.isCompatible(bird)) {
        // throw error
        throw new IllegalStateException("Attempted to add a bird to incompatible aviary.");
      }
      else {
        //bird is compatible with aviary
        this.birdList.add((BirdClass)bird);
        this.numBirds ++;
        return this;
      }
    }
  }

  // printSign prints bird info to user for that aviary
  // TODO : should this System.out.println, or should it return a string?
  public String printSign(){
    // iterate through birdList, printing each bird's info:
    String output = "Birds housed in this aviary are:\n\n";
    for (int i = 0; i < this.numBirds; i++) {
      output += this.birdList.get(i).toString() + "\n";
    }
    return output;
  }


  // isFull return true if the aviary already has 5 birds, false if there is room to add another bird:
  public boolean isFull(){
    if (this.numBirds == 5) {
      return true;
    }
    else { return false; }
  }




  // isCompatible(BirdClass bird) checks whether the
  //       given bird is compatible with this aviary
  public boolean isCompatible(Bird bird) {
    boolean compatible = false;
    switch (this.aviaryType) {
      case GENERAL:
        if(bird instanceof BirdOfPrey ||
                bird instanceof WaterBird ||
                bird instanceof FlightlessBird) {
          compatible = false;
        } else { compatible = true; }
        break;

      case FLIGHTLESS:
        if (bird instanceof FlightlessBird) {
          compatible = true;
        } else { compatible = false; }
        break;

      case WATER_BIRDS:
        if (bird instanceof WaterBird) {
          compatible = true;
        } else { compatible = false; }
        break;

      case BIRDS_OF_PREY:
        if (bird  instanceof BirdOfPrey) {
          compatible = true;
        } else {compatible = false; }
        break;
    }
    return compatible;
  }



}