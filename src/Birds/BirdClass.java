package Birds;
import java.util.ArrayList;

public class BirdClass implements Bird  {

    private String name;
    private int wingNum;
    private String birdType;        // these attributes are both kind of specific to children classes --
    private String description;     // not sure if/how to make them make sense here. 
    private boolean extinct;




    
    // TODO: Should this be abstract? Because we can't really construct a typeless bird object... if this were an 
    // abstract method, then we could implement it in each child class.... but that's a bunch of code duplication... hm
    
    public BirdClass(String name, int wingNum, boolean extinct) {
        this.name = name;
        this.wingNum = wingNum;
        this.extinct = extinct;
    }
    
    // Overloading the constructor (if we can assume a bird is not extinct):
        public BirdClass(String name, int wingNum) {
        this.name = name;
        this.wingNum = wingNum;
        this.extinct = false;
    }
    
    // Overloading the constructor (if we can assume a bird has 2 wings):
    public BirdClass(String name, boolean extinct) {
        this.name = name;
        this.wingNum = 2;
        this.extinct = extinct;
    }
    
    // Overloading the constructor (if we can assume a bird has 2 wings and is not extinct):
    public BirdClass(String name) {
        this.name = name;
        this.wingNum = 2;
        this.extinct = false;
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
