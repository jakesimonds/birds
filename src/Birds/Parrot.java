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
    public Parrot(String name, int wingNum, int knownWords, String favoritePhrase, boolean extinct, ArrayList<FOOD> foodPreference, String characteristic) {
        super(name, wingNum, extinct, foodPreference, characteristic);

        if (knownWords < 0 || knownWords > 100) {
            throw new IllegalArgumentException("Parrots can't know more than 100 or less than 0 words");
        }
        
        this.description = "Parrots have a short, curved beak and are known for their intelligence and ability to mimic sounds.";
        this.knownWords = knownWords;
        this.favoritePhrase = favoritePhrase;
        this.setBirdType("Parrot");
    }
    
    // Get Known Words
    public int getKnownWords() {
        return this.knownWords;   
    }
    
    // Get Favorite Phrase
    public String getFavoritePhrase() {
        return this.favoritePhrase;
    }

    @Override
    public String toString() {
        String extinctIsIsnt = "is not";
        if (this.extinct) {
            extinctIsIsnt = "is";
        }
        return "The " + this.getBirdName() + " is a type of " + this.getBirdType() + ".\n" +
                "It has " + this.getNumberOfWings() + " wings, and " + extinctIsIsnt + " extinct.\n" +
                "This " + this.getBirdName() + "'s defining characteristic is: " + this.getBirdCharacteristic() + ".\n" +
                this.getFoodPrefString() + "\n" +
                "Vocabulary size: " + this.knownWords + " known words.\n" +
                "Favorite Phrase: " + this.favoritePhrase ;
    }
    


}
