

package Birds;
import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;

public class birdTest {


    //WHAT DO WE WANT WHEN A BIRD HAS -3 or 33 wings??
    @Test
    public void TestGetNumberOfWings() {
        ArrayList<FOOD> foodPref = new ArrayList();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Larry", 1, false, foodPref);
        BirdClass larry1 = new Pigeon("Larry", 0, false, foodPref);
        BirdClass larry2 = new Pigeon("Larry", -3, false, foodPref);
        BirdClass larry3 = new Pigeon("Larry", 33, false, foodPref);
        assertEquals(1, larry.getNumberOfWings());
        assertEquals(0, larry1.getNumberOfWings());
        assertEquals(-3, larry2.getNumberOfWings());
        assertEquals(33, larry3.getNumberOfWings());

    }


    @Test
    public void TestBirdEquality() {
        ArrayList<FOOD> foodPref = new ArrayList();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        BirdClass larry = new Pigeon("Larry", 0, false, foodPref);
        BirdClass larry2 = new Pigeon("Larry", 0, false, foodPref);

        assertEquals(larry, larry2);

    }

    //my understanding is: bird type = names of subclasses, maybe need to build a method
    @Test
    public void TestGetBirdType() {
        assertEquals(1, 1);

    }

    //
    @Test
    public void TestGetCharacteristic() {
        assertEquals(1, 1);

    }

    @Test
    public void TestGetExtinct() {
        ArrayList<FOOD> foodPref = new ArrayList();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        BirdClass larry = new Pigeon("Larry", 2, true, foodPref);
        BirdClass larry2 = new Pigeon("Larry", 2, false, foodPref);
        assertEquals(larry.getExtinct(), true);
        assertEquals(larry2.getExtinct(), false);


    }

    //testing too many or not enough food preference items
    @Test(expected = IllegalArgumentException.class)
    public void TestGetFoodPreference() {
        ArrayList<FOOD> foodPref = new ArrayList();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        foodPref.add(FOOD.INSECTS);
        foodPref.add(FOOD.AQUATIC_INVERTEBRATES);
        foodPref.add(FOOD.EGGS);

        ArrayList<FOOD> foodPref1 = new ArrayList();
        foodPref.add(FOOD.BERRIES);
        BirdClass larry = new Pigeon("Larry", 2, true, foodPref);
        BirdClass larry2 = new Pigeon("Larry2", 2, false, foodPref1);


        //

    }

    @Test()
    public void TestGetFoodPreference2() {
        ArrayList<FOOD> foodPref = new ArrayList();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        foodPref.add(FOOD.INSECTS);
        foodPref.add(FOOD.AQUATIC_INVERTEBRATES);


        ArrayList<FOOD> foodPref1 = new ArrayList();
        foodPref1.add(FOOD.BERRIES);
        foodPref1.add(FOOD.EGGS);
        BirdClass larry = new Pigeon("Larry", 2, true, foodPref);
        BirdClass larry2 = new Pigeon("Larry2", 2, false, foodPref1);

        assertNotEquals(larry.getFoodPreference(), larry2.getFoodPreference());

        //System.out.println(birdEx.toString());
        //this will be the bird test


    }

}
