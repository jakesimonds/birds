package Birds;
import java.util.ArrayList;

public class Parrot extends BirdClass {
    
    // Member fields: SHOULD THESE BE INCLUDED HERE IF THEY ARE INHERITED FROM BIRD CLASS?
    String name;
    int wingNum;
    boolean extinct;
    String description;
    
    // Parrot-specific attributes:
    int knownWords;
    String favoritePhrase;
    
   
    // Constructor:
    public Parrot(String name, int wingNum, int knownWords, String favoritePhrase, boolean extinct, ArrayList<FOOD> foodPreference) {
        super(name, wingNum, extinct, foodPreference);

        if (knownWords < 0 || knownWords > 100) {
            throw new IllegalArgumentException("Parrots can't know more than 100 or less than 0 words");
        }
        
        this.description = "Parrots have a short, curved beak and are known for their intelligence and ability to mimic sounds.";
        this.knownWords = knownWords;
        this.favoritePhrase = favoritePhrase;
        this.birdType = "Parrot";
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
