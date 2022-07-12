

package Birds;
import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;

public class birdTest {


    //=================================== Testing bird constructor =======================================
    @Test()
    public void TestBirdConstructor() {
        ArrayList<FOOD> foodPref = new ArrayList();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        BirdClass larry = new Pigeon("Larry", 2, false, foodPref, "great with children");
        BirdClass larry2 = new Pigeon("Larry", 2, false, foodPref, "great with children");

        assertEquals(larry, larry2);

    }



    //=================================== Testing getNumberOfWings =======================================
    @Test(expected = IllegalArgumentException.class)
    public void TestGetNumberOfWings() {
        ArrayList<FOOD> foodPref = new ArrayList();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Larry", 1, false, foodPref, "great with children");
        BirdClass larry1 = new Pigeon("Larry", -1, false, foodPref, "great with children");
        BirdClass larry2 = new Pigeon("Larry", -3, false, foodPref, "great with children");
        BirdClass larry3 = new Pigeon("Larry", 33, false, foodPref, "great with children");
        assertEquals(1, larry.getNumberOfWings());
        assertEquals(0, larry1.getNumberOfWings());
        assertEquals(-3, larry2.getNumberOfWings());
        assertEquals(33, larry3.getNumberOfWings());

    }


    //=================================== Testing Add BirdEquality =======================================
    @Test
    public void TestBirdEquality() {
        ArrayList<FOOD> foodPref = new ArrayList();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        BirdClass larry = new Pigeon("Larry", 2, false, foodPref, "great with children");
        BirdClass larry2 = new Pigeon("Larry", 2, false, foodPref, "great with children");

        assertEquals(larry, larry2);

    }


    //=================================== Testing GetBirdType =======================================
    @Test
    public void TestGetBirdType() {
        ArrayList<FOOD> foodPref = new ArrayList();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        BirdClass larry = new Pigeon("Larry", 2, false, foodPref, "great with children");
        BirdClass larry2 = new Owl("Larry", 2, false, foodPref, "great with children");
        assertEquals("Pigeon", larry.getBirdType());
        assertEquals("Owl", larry2.getBirdType());

    }


    //=================================== Testing GetCharacteristic =======================================
    @Test
    public void TestGetCharacteristic() {
        assertEquals(1, 1);

    }


    //=================================== Testing GetExtinct =======================================
    @Test
    public void TestGetExtinct() {
        ArrayList<FOOD> foodPref = new ArrayList();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        BirdClass larry = new Pigeon("Larry", 2, true, foodPref, "great with children");
        BirdClass larry2 = new Pigeon("Larry", 2, false, foodPref, "great with children");
        assertEquals(larry.getExtinct(), true);
        assertEquals(larry2.getExtinct(), false);


    }


    //=================================== Testing Too many/not enough food items =======================================
    @Test(expected = IllegalArgumentException.class)
    public void TestGetFoodPreference() {
        ArrayList<FOOD> foodPref = new ArrayList();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        foodPref.add(FOOD.INSECTS);
        foodPref.add(FOOD.AQUATIC_INVERTEBRATES);
        foodPref.add(FOOD.EGGS);

        BirdClass larry2 = new Pigeon("Larry2", 2, false, foodPref, "great with children");

    }
    @Test(expected = IllegalArgumentException.class)
    public void TestGetFoodPreference2() {

        ArrayList<FOOD> foodPref1 = new ArrayList();
        foodPref1.add(FOOD.BERRIES);
        BirdClass larry = new Pigeon("Larry", 2, true, foodPref1, "great with children");

    }

    //=================================== Testing equality of food items =======================================
    @Test()
    public void TestGetFoodPreference3() {
        ArrayList<FOOD> foodPref = new ArrayList();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        foodPref.add(FOOD.INSECTS);
        foodPref.add(FOOD.AQUATIC_INVERTEBRATES);


        ArrayList<FOOD> foodPref1 = new ArrayList();
        foodPref1.add(FOOD.BERRIES);
        foodPref1.add(FOOD.EGGS);
        BirdClass larry = new Pigeon("Larry", 2, true, foodPref, "great with children");
        BirdClass larry2 = new Pigeon("Larry2", 2, false, foodPref1, "great with children");

        assertNotEquals(larry.getFoodPreference(), larry2.getFoodPreference());
        //assertEquals(4,getLength(foodPref))

    }
    //=================================== PARROT SPECIFIC TESTS =======================================

    //knownwords violation
    @Test(expected = IllegalArgumentException.class)
    public void TestParrotKnownWords() {
        ArrayList<FOOD> foodPref = new ArrayList();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        foodPref.add(FOOD.INSECTS);
        foodPref.add(FOOD.AQUATIC_INVERTEBRATES);

        BirdClass larry = new Parrot("Larry", 2, -10, "Bummer, man!",false, foodPref, "great with children");
        BirdClass larry2 = new Parrot("Larry", 2, 101, "Bummer, man!",false, foodPref, "great with children");


    }

    //GetKnownWords test
    @Test()
    public void TestGetKnownWords() {
        ArrayList<FOOD> foodPref = new ArrayList();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        foodPref.add(FOOD.INSECTS);
        foodPref.add(FOOD.AQUATIC_INVERTEBRATES);

        BirdClass larry = new Parrot("Larry", 2, 10, "Bummer, man!",false, foodPref, "great with children");
        BirdClass larry2 = new Parrot("Larry", 2, 99, "Bummer, man!",false, foodPref, "great with children");
        assertEquals(10, ((Parrot) larry).getKnownWords());
        assertEquals(99, ((Parrot) larry2).getKnownWords());


    }

    //Favorite Phrase test
    @Test()
    public void TestGetFavoritePhrase() {
        ArrayList<FOOD> foodPref = new ArrayList();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        foodPref.add(FOOD.INSECTS);
        foodPref.add(FOOD.AQUATIC_INVERTEBRATES);

        BirdClass larry = new Parrot("Larry", 2, 10, "Bummer, man!",false, foodPref, "great with children");
        BirdClass larry2 = new Parrot("Larry", 2, 11, "",false, foodPref, "great with children");

        assertEquals("Bummer, man!",((Parrot)larry).getFavoritePhrase());
        assertEquals("",((Parrot)larry2).getFavoritePhrase());
    }

    //=================================== WATERBIRDS TESTS =======================================

    @Test()
    public void TestGetBodyOfWater() {
        ArrayList<FOOD> foodPref = new ArrayList();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        foodPref.add(FOOD.INSECTS);
        foodPref.add(FOOD.AQUATIC_INVERTEBRATES);

        BirdClass larry = new Shorebird("Larry", 2, false, foodPref, WATER.OCEAN, "great with children");
        BirdClass larry2 = new Waterfowl("Larry", 2, false, foodPref,WATER.LAKE, "great with children");
        BirdClass larry3 = new Shorebird("Larry", 2, false, foodPref, WATER.RIVER, "great with children");
        BirdClass larry4 = new Waterfowl("Larry", 2, false, foodPref,WATER.FRESHWATER_SHORELANDS, "great with children");

        assertEquals(WATER.OCEAN,((Shorebird)larry).getBodyOfWater());
        assertEquals(WATER.LAKE,((Waterfowl)larry2).getBodyOfWater());
        assertEquals(WATER.RIVER,((Shorebird)larry3).getBodyOfWater());
        assertEquals(WATER.FRESHWATER_SHORELANDS,((Waterfowl)larry4).getBodyOfWater());

    }




}
