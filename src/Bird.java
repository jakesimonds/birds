public interface Bird {
    //interface for bird parent class

    //return the number of wings that bird has
    public int getNumberOfWings();

    //return the type of bird (ie. kiwi, moa, etc.)
    public String getBirdType();

    // get a description/characteristic of that bird/family of birds
    public String getCharacteristic();

    // return true if bird is extinct, false otherwise
    public boolean getExtinct();

    // return an array of FOOD types (enum class in its own file) (2-4)
    public FOOD[] getFoodPreference();




}
