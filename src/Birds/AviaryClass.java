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



  //================================== CONSTRUCTORS ======================================
  public AviaryClass(String aviaryName, AVIARY_TYPE aviaryType, String aviaryLocation) {
    this.aviaryName = aviaryName;
    this.aviaryType = aviaryType;
    this.aviaryLocation = aviaryLocation;
    // initialized with 0 birds:
    this.numBirds = 0;
    this.birdList = new ArrayList<>();
  }

  //===================================== METHODS ========================================

  // getBirdList() -- returns an Arraylist of the bird objects in that aviary
  public ArrayList<BirdClass> getBirdList(){
    return this.birdList;
  }

  // getAviaryName() -- returns the name of the aviary
  public String getAviaryName() {
    return this.aviaryName;
  }

  // getAviaryLocation() -- returns a string for that aviary's location
  public String getAviaryLocation(){
    return this.aviaryLocation;
  }

  // getSize() -- returns the number of birds in the aviary
  public int getSize() {
    return this.numBirds;
  }

  // getType() -- returns the type of birds stored in the aviary (from AVIARY_TYPE enum)
  public AVIARY_TYPE getType() {
    return this.aviaryType;
  }

  // addBird() -- adds the given bird to this aviary
  // (fails if bird is extinct, if there is no room for the bird, bird is wrong type)
  @Override
  public Aviary addBird(Bird bird) {
    if (bird.getExtinct()) {
      // bird is extinct
      throw new IllegalStateException("Cannot add an extinct bird to an aviary.");
    } else {
      if (this.isFull()) {
        // aviary is full
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
          this.birdList.add((BirdClass) bird);
          this.numBirds++;
          return this;
        }
      }
    }
  }

  // printSign() -- returns a String listing birds housed in that aviary
  public String printSign(){
    // iterate through birdList, printing each bird's info:
    String output = "Birds housed in " + this.getAviaryName() + " are:\n\n";
    for (int i = 0; i < this.numBirds; i++) {
      BirdClass currentBird = this.birdList.get(i);
      output += currentBird.toString() + "--" + "\n";
      // TODO : SHOULD THIS BE bird.toString() or bird.getName() ???
      //  "gives a description of the birds it houses and any interesting information that it may have about that animal"
      //  (should include the description in toString for BirdClass)
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