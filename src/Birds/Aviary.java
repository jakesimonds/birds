package Birds;
import java.util.ArrayList;

// Interface which represents an Aviary in our conservatory which can hold up to 5 birds

public interface Aviary {

  
  // methods:
  // Add Bird (fails if bird is extinct, if there is no room for the bird, bird is wrong type)
  // UPDATES numOfBirds
  public Aviary addBird(BirdClass bird);

  // getAviaryName returns the name of that aviary
  public String getAviaryName();
  
  // printSign prints bird info to user for that aviary
  public String printSign();
  
  // getAviaryLocation returns a string for that aviary's location
  public String getAviaryLocation();

  
  // isFull return true if the aviary already has 5 birds, false if there is room to add another bird:
  public boolean isFull();

  // getSize returns the number of birds in the aviary
  public int getSize();
  
// getType returns the type of birds stored in the aviary (from AVIARY_TYPE enum)
  public AVIARY_TYPE getType();

  public ArrayList<BirdClass> getBirdList();
  
}
