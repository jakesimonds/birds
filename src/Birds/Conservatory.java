package Birds;
import java.util.ArrayList;

// Represents a conservatory which can house up to 20 Aviaries
// which house rescued birds

public interface Conservatory {

  
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

  // isFUll() -- Returns true if the conservatory already has 20 Aviaries, false otherwise
  public boolean isFull();

}
