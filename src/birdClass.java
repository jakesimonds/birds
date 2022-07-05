public class birdClass implements bird  {

    private String name;
    private int wingNum;
    private String birdType;
    private String description;
    private boolean extinct;



    public birdClass(String name, int wingNum ) {
        this.name = name;
        this.wingNum = wingNum;

    }
    @Override
    public int getNumberOfWings() {
        return 0;
    }

    @Override
    public String getBirdType() {
        return null;
    }

    @Override
    public String getCharacteristic() {
        return null;
    }

    @Override
    public boolean getExtinct() {
        return false;
    }

    @Override
    public String getFoodPreference() {
        return null;
    }

    @Override
    public String toString() {

        return null;
    }



}
