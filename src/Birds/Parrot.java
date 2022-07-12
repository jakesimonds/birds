package Birds;
import java.util.ArrayList;

public class Parrot extends BirdClass {
    
    // Member fields:
    String description;
    
    // Parrot-specific attributes:
    int knownWords;
    String favoritePhrase;


    //===================================== CONSTRUCTORS =========================================
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

    // if we can assume 2 wings:
    public Parrot(String name, int knownWords, String favoritePhrase, boolean extinct, ArrayList<FOOD> foodPreference, String characteristic) {
        super(name, extinct, foodPreference, characteristic);

        if (knownWords < 0 || knownWords > 100) {
            throw new IllegalArgumentException("Parrots can't know more than 100 or less than 0 words");
        }
        this.description = "Parrots have a short, curved beak and are known for their intelligence and ability to mimic sounds.";
        this.knownWords = knownWords;
        this.favoritePhrase = favoritePhrase;
        this.setBirdType("Parrot");
    }


    // if we can assume not extinct:
    public Parrot(String name, int wingNum, int knownWords, String favoritePhrase, ArrayList<FOOD> foodPreference, String characteristic) {
        super(name, wingNum, foodPreference, characteristic);

        if (knownWords < 0 || knownWords > 100) {
            throw new IllegalArgumentException("Parrots can't know more than 100 or less than 0 words");
        }
        this.description = "Parrots have a short, curved beak and are known for their intelligence and ability to mimic sounds.";
        this.knownWords = knownWords;
        this.favoritePhrase = favoritePhrase;
        this.setBirdType("Parrot");
    }


    // if we can assume both 2 wings and not extinct:
    public Parrot(String name, int knownWords, String favoritePhrase,ArrayList<FOOD> foodPreference, String characteristic) {
        super(name, foodPreference, characteristic);

        if (knownWords < 0 || knownWords > 100) {
            throw new IllegalArgumentException("Parrots can't know more than 100 or less than 0 words");
        }
        this.description = "Parrots have a short, curved beak and are known for their intelligence and ability to mimic sounds.";
        this.knownWords = knownWords;
        this.favoritePhrase = favoritePhrase;
        this.setBirdType("Parrot");
    }


    //===================================== METHODS =========================================

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
        if (this.getExtinct()) {
            extinctIsIsnt = "is";
        }
        return "The " + this.getBirdName() + " is a type of " + this.getBirdType() + ".\n" +
                "This " + this.getBirdName() + " has " + this.getNumberOfWings() + " wings, and " + extinctIsIsnt + " extinct.\n" +
                "This " + this.getBirdName() + "'s defining characteristic is: " + this.getBirdCharacteristic() + ".\n" +
                this.getFoodPrefString() + "\n" +
                "Vocabulary size: " + this.knownWords + " known words.\n" +
                "Favorite Phrase: " + this.favoritePhrase ;
    }
    


}
