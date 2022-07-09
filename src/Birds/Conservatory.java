package Birds;
import java.util.ArrayList;

// Represents a conservatory which can house up to 20 Aviaries
// which house rescued birds

public interface Conservatory {

  
  // Guest Lookup (returns which aviary that bird is housed in)
  //       print/return an error message if bird does not exist
  public String guestLookup(String birdName);



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
  public String printIndex();




  // Print Map
  public void printMap();


  // Calculate Food
  public String calculateFood();

  
  // Rescue New Bird
  // FAILS if conservatory is full
  public Conservatory rescueBird(BirdClass bird);


  
  // Is Full -- Returns true if the conservatory already has 20 Aviaries, false otherwise
  // TODO: SHOULD THIS CHECK WHETHER THERE ARE 100 BIRDS, OR 20 AVIARIES??
  public boolean isFull();
  
  
}
