package Birds;
import java.util.ArrayList;

// Interface which represents an Aviary in our conservatory which can hold up to 5 birds
public interface Aviary {

  // getBirdList() -- returns an ArrayList of bird objects housed in the aviary.
  public ArrayList<BirdClass> getBirdList();

  // getAviaryName() -- returns the name of that aviary
  public String getAviaryName();

  // getAviaryLocation() -- returns a string for that aviary's location
  public String getAviaryLocation();

  // getSize() -- returns the number of birds in the aviary
  public int getSize();

  // getType() -- returns the type of birds stored in the aviary (from AVIARY_TYPE enum)
  // (GENERAL, WATER_BIRDS, BIRDS_OF_PREY, FLIGHTLESS)
  public AVIARY_TYPE getType();

  // addBird(bird) -- adds the given bird object to the aviary (if possible)
  public Aviary addBird(BirdClass bird);

  // printSign() -- prints bird info to user for that aviary
  public String printSign();

  // isFull() -- return true if the aviary already has 5 birds,
  //                false if there is room to add another bird:
  public boolean isFull();


  
}
