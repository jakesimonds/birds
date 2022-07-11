package Birds;
import java.util.ArrayList;

// Represents a conservatory which can house up to 20 Aviaries
// which each house up to 5 rescued birds

public interface Conservatory {
  // getName() -- returns the name of the conservatory
  public String getName();

  // getNumBirds() -- returns the number of birds currently housed in the conservatory
  public int getNumBirds();

  // getNumAviaries returns the number of aviaries currently housed in the conservatory
  public int getNumAviaries();

  // guestLookup(bird) -- returns which aviary that bird is housed in
  public String guestLookup(String birdName);

  // printIndex() -- lists all birds in conservatory in alphabetical order, and their location
  public String printIndex();

  // printMap() -- prints a "map" of the conservatory -
  public String printMap();

  // calculateFood() -- returns a String detailing what food/quantities are
  //                    required for the birds currently housed in the conservatory
  public String calculateFood();

  // rescueNewBird(bird) -- adds new bird to the conservatory if/where
  //                        there is room for it (in a compatible aviary)
  public Conservatory rescueBird(Bird bird);

  // returns a list of existing aviary objects within the conservatory
  public ArrayList<AviaryClass> getAviaryList();


  // isFUll() -- Returns true if the conservatory already has 100 birds, false otherwise
  public boolean isFull();

  // aviariesFull() -- Returns true if the conservatory already has 20 Aviaries, false otherwise
  public boolean aviaryListFull();

}
