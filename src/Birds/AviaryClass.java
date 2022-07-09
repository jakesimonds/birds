package Birds;
import java.util.ArrayList;


public class AviaryClass implements Aviary {

  // Member Fields:
  // numBirds, birdList, type (of birds stored in it)?? etc.
  
  // @Override methods from Aviary interface

}
  // methods:
  // Add Bird (fails if bird is extinct, if there is no room for the bird, bird is wrong type)
  // UPDATES numOfBirds
  public void addBird(BirdClass bird);

  // printSign prints bird info to user for that aviary
  public void printSign();

  // getAviaryLocation returns a string for that aviary's location
  public String getAviaryLocation();

  // getBirdList is a private method which returns a list of the bird objects in that aviary
  // SHOULD WE USE A LINKED LIST FOR STORING THESE LISTS OF BIRD/AVIARY OBJECTS???????? * * * * * * * * * * * *
  private Bird[] getBirdList();

  // isFull return true if the aviary already has 5 birds, false if there is room to add another bird:
  public boolean isFull();