package Birds;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;


public class conservatoryTest {

    @Test
    public void ConservatoryTestIsFull() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Larry", 2, false, foodPref);

        ConservatoryClass conservatory = new ConservatoryClass();

        //TODO: 96th pigeon makes isFull return true
        for(int i = 0; i<95; i++){
            conservatory.rescueBird(larry);
        }
        assertEquals(false,conservatory.isFull());
        //conservatory.rescueBird(larry);
        //assertEquals(true,conservatory.isFull());


    }

    @Test(expected = IllegalStateException.class)
    public void ConservatoryTestTooMany() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Larry", 2, false, foodPref);

        ConservatoryClass conservatory = new ConservatoryClass();

        for(int i = 0; i<101; i++){
            conservatory.rescueBird(larry);
        }

    }


    @Test(expected = IllegalStateException.class)
    public void ConservatoryTestDifferentBirds() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        ArrayList<FOOD> foodPrefPrey = new ArrayList<>();
        foodPref.add(FOOD.SMALL_MAMMALS);
        foodPref.add(FOOD.LARVAE);
        ArrayList<FOOD> foodPrefParrot = new ArrayList<>();
        foodPref.add(FOOD.INSECTS);
        foodPref.add(FOOD.LARVAE);

        BirdClass larry = new Pigeon("Larry", 2, false, foodPref);
        BirdClass barry = new BirdOfPrey("Barry", 2, false,foodPrefPrey);
        BirdClass gary = new Parrot("Gary",2, 44, "idk",false,foodPrefParrot);

        ConservatoryClass conservatory = new ConservatoryClass();

        for(int i = 0; i<30; i++){
            conservatory.rescueBird(larry);
            conservatory.rescueBird(larry);
            conservatory.rescueBird(larry);
        }

    }


    //alphabetical: can name two bird AAA & ZZZ, call their names by index or something




}
