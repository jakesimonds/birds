public class birdClass implements bird  {

    private String name;
    private int wingNum;
    private String birdType;
    private String description;
    private boolean extinct;



    public birdClass(String name, int wingNum) {
        this.name = name;
        this.wingNum = wingNum;

    }
    @Override
    public int getNumberOfWings() {
        return this.wingNum;
    }

    @Override
    public String getBirdType() {
        return this.birdType;
    }

    @Override
    public String getCharacteristic() {
        return this.description;
    }

    @Override
    public boolean getExtinct() {
        return this.extinct;
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
