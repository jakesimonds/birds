public class Parrot extends birdClass {
    
    // Member fields: SHOULD THESE BE INCLUDED HERE IF THEY ARE INHERITED FROM BIRD CLASS?
    String name;
    int wingNum;
    boolean extinct;
    String description;
    
    // Parrot-specific attributes:
    int knownWords;
    String favoritePhrase;
    
   
    // Constructor:
    public Parrot(String name, int wingNum, int knownWords, String favoritePhrase) {
        super(name, wingNum);
        
        this.description = "Parrots have a short, curved beak and are known for their intelligence and ability to mimic sounds.";
        this.knownWords = knownWords;
        this.favoritePhrase = favoritePhrase;
    }
    
    // Get Known Words
    public int getKnownWords() {
        return this.knownWords;   
    }
    
    // Get Favorite Phrase
    public String getFavoritePhrase() {
        return this.favoritePhrase;
    }
    


}
