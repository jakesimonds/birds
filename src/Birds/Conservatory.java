package Birds;
import java.util.ArrayList;

// Represents a conservatory which can house up to 20 Aviareis
// which house rescued birds

public interface Conservatory {

  
  // Guest Lookup
  // print an error message if bird does not exist
  public String guestLookup(BirdClass bird);
  
  // Print Index
  public void printIndex();
  
  // Print Map
  public void printMap();
  
  // Calculate Food
  public String calculateFood();
  
  // Rescue New Bird
  // FAILS if conservatory is full
  public void rescueBird();
  
  // (Private) Add Aviary -- Adds a new Aviary to the Conservatory
  // FAILS if there are already 20 aviaries
  private void addAviary();
  
  // (Private) Get Aviary List -- 
  // TODO : WHAT TYPE DOES THIS RETURN (Aviary Array? Aviary[] ?)
  private getAviaryList();
  
  // Is Full -- Returns true if the conservatory already has 20 Aviaries, false otherwise
  // TODO: SHOULD THIS CHECK WHETHER THERE ARE 100 BIRDS, OR 20 AVIARIES??
  public boolean isFull();
  
  
}
