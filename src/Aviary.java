// Interface which represents an Aviary in our conservatory which can hold up to 5 birds

public interface Aviary {

  
  // methods:
  // Add Bird (fails if bird is extinct, if there is no room for the bird, bird is wrong type)
  // UPDATES numOfBirds
  public void addBird(Bird bird);
  
  // printSign prints bird info to user for that aviary
  public void printSign();
  
  // getAviaryLocation returns a string for that aviary's location
  public String getAviaryLocation();
  
  // getBirdList is a private method which returns a list of the bird objects in that aviary
  // SHOULD WE USE A LINKED LIST FOR STORING THESE LISTS OF BIRD/AVIARY OBJECTS???????? * * * * * * * * * * * * 
  private Bird[] getBirdList();
  
  // isFull return true if the aviary already has 5 birds, false if there is room to add another bird:
  public boolean isFull();
  
  
  
  // other ideas we haven't talked about:
  // getSize (returns int number of birds in aviary)
  // getType (get the specific type of birds stored there (ie general, birdOfPrey, waterfowl, or shorebird) 
   //   THEN BIRD TYPE COULD ALSO BE AN ATTRIBUTE OF AVIARY (ie. what bird type is stored in this aviary?)
  // 
  
}
