package Birds;
import java.util.ArrayList;

public interface Bird {
    //interface for bird parent class


    // return the name of the bird
    public String getBirdName();

    //return the number of wings that bird has
    public int getNumberOfWings();

    //return the type of bird (ie. kiwi, moa, etc.)
    public String getBirdType();

    // get a description/characteristic of that bird/family of birds
    // public String getCharacteristic();

    // return true if bird is extinct, false otherwise
    public boolean getExtinct();

    // return an array of FOOD types (enum class in its own file) (2-4)
    public ArrayList<FOOD> getFoodPreference();

    String getFoodPrefString();

    public void setBirdType(String birdType);


    public String getBirdCharacteristic();

    void setBirdCharacteristic(String birdCharacteristic);
}
