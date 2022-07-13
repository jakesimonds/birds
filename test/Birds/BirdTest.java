
package Birds;
import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {

    //=================================== Testing bird constructor =======================================
    @Test()
    public void TestBirdConstructor() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry2 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");

        assertEquals(larry, larry2);

    }

    //=================================== Testing getBirdName =======================================
    @Test
    public void TestGetBirdName() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry2 = new Owl("Barn Owl", 2, false, foodPref, "great with children");
        assertEquals("Common Pigeon", larry.getBirdName());
        assertEquals("Barn Owl", larry2.getBirdName());

    }


    //=================================== Testing getNumberOfWings =======================================
    @Test
    public void TestGetNumberOfWings() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Common Pigeon", 0, false, foodPref, "great with children");
        BirdClass larry1 = new Pigeon("Common Pigeon", 1, false, foodPref, "great with children");
        BirdClass larry2 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry3 = new Pigeon("Common Pigeon", 3, false, foodPref, "great with children");
        assertEquals(0, larry.getNumberOfWings());
        assertEquals(1, larry1.getNumberOfWings());
        assertEquals(2, larry2.getNumberOfWings());
        assertEquals(3, larry3.getNumberOfWings());

    }



    //=================================== Testing GetBirdType =======================================
    @Test
    public void TestGetBirdType() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry2 = new Owl("Barn Owl", 2, false, foodPref, "great with children");
        assertEquals("Pigeon", larry.getBirdType());
        assertEquals("Owl", larry2.getBirdType());

    }

    //=================================== Testing GetExtinct =======================================
    @Test
    public void TestGetExtinct() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        BirdClass larry = new Pigeon("Common Pigeon", 2, true, foodPref, "great with children");
        BirdClass larry2 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        assertTrue(larry.getExtinct());
        assertFalse(larry2.getExtinct());


    }

    //=================================== Testing GetFoodPreference =======================================
    @Test
    public void TestGetFoodPreference() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        foodPref.add(FOOD.INSECTS);
        foodPref.add(FOOD.EGGS);

        BirdClass larry2 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        assertEquals(foodPref, larry2.getFoodPreference());
    }

    @Test
    public void TestGetFoodPreference2() {

        ArrayList<FOOD> foodPref1 = new ArrayList<>();
        foodPref1.add(FOOD.BERRIES);
        foodPref1.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Common Pigeon", 2, true, foodPref1, "great with children");
        assertEquals(foodPref1, larry.getFoodPreference());
    }

//=================================== Testing GetFoodPrefString =======================================
    @Test
    public void TestGetFoodPrefString() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        foodPref.add(FOOD.INSECTS);

        BirdClass larry2 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        String food = larry2.getFoodPrefString();
        assertTrue(food.contains("buds"));
        assertTrue(food.contains("insects"));
        assertTrue(food.contains("berries"));
    }

    //=================================== Testing SetBirdType =======================================
    @Test
    public void TestSetBirdType() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        foodPref.add(FOOD.INSECTS);


        BirdClass larry2 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        larry2.setBirdType("Testing setBirdType");
        assertEquals("Testing setBirdType",larry2.getBirdType());

    }

    //=================================== Testing GetBirdCharacteristic =======================================
    @Test
    public void TestGetBirdCharacteristic() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        foodPref.add(FOOD.INSECTS);

        BirdClass larry2 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");

        assertEquals("great with children", larry2.getBirdCharacteristic());
    }

    //=================================== Testing SetBirdCharacteristic =======================================

    @Test
    public void TestSetBirdCharacteristic() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        foodPref.add(FOOD.INSECTS);

        BirdClass larry2 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        larry2.setBirdCharacteristic("Testing setBirdCharacteristic");
        assertEquals("Testing setBirdCharacteristic",larry2.getBirdCharacteristic());
    }



    //=================================== Testing equality of food items =======================================
    @Test
    public void TestGetFoodPreference3() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        foodPref.add(FOOD.INSECTS);
        foodPref.add(FOOD.AQUATIC_INVERTEBRATES);


        ArrayList<FOOD> foodPref1 = new ArrayList<>();
        foodPref1.add(FOOD.BERRIES);
        foodPref1.add(FOOD.EGGS);
        BirdClass larry = new Pigeon("Common Pigeon", 2, true, foodPref, "great with children");
        BirdClass larry2 = new Pigeon("Common Pigeon", 2, false, foodPref1, "great with children");

        assertNotEquals(larry.getFoodPreference(), larry2.getFoodPreference());
        //assertEquals(4,getLength(foodPref))

    }
    //=================================== PARROT SPECIFIC TESTS =======================================

    //knownwords violation
    @Test(expected = IllegalArgumentException.class)
    public void TestParrotKnownWords() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Parrot("Red Parrot", 2, -10, "Bummer, man!",false, foodPref, "great with children");
    }
    @Test(expected = IllegalArgumentException.class)
    public void TestParrotKnownWords1() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Parrot("Red Parrot", 2, 111, "Bummer, man!",false, foodPref, "great with children");
    }

    //GetKnownWords test
    @Test()
    public void TestGetKnownWords() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        foodPref.add(FOOD.INSECTS);
        foodPref.add(FOOD.AQUATIC_INVERTEBRATES);

        BirdClass larry = new Parrot("Blue Parrot", 2, 10, "Bummer, man!",false, foodPref, "great with children");
        BirdClass larry2 = new Parrot("Blue Parrot", 2, 99, "Bummer, man!",false, foodPref, "great with children");
        assertEquals(10, ((Parrot) larry).getKnownWords());
        assertEquals(99, ((Parrot) larry2).getKnownWords());


    }

    //Favorite Phrase test
    @Test()
    public void TestGetFavoritePhrase() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        foodPref.add(FOOD.INSECTS);
        foodPref.add(FOOD.AQUATIC_INVERTEBRATES);

        BirdClass larry = new Parrot("Rose-Ring Parrot", 2, 10, "Bummer, man!",false, foodPref, "great with children");
        BirdClass larry2 = new Parrot("Grey Parrot", 2, 11, "",false, foodPref, "great with children");

        assertEquals("Bummer, man!",((Parrot)larry).getFavoritePhrase());
        assertEquals("",((Parrot)larry2).getFavoritePhrase());
    }

    //=================================== WATERBIRDS TESTS =======================================

    @Test()
    public void TestGetBodyOfWater() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        foodPref.add(FOOD.INSECTS);
        foodPref.add(FOOD.AQUATIC_INVERTEBRATES);

        BirdClass larry = new Shorebird("Great Awk", 2, false, foodPref, WATER.OCEAN, "great with children");
        BirdClass larry2 = new Waterfowl("Duck", 2, false, foodPref,WATER.LAKE, "great with children");
        BirdClass larry3 = new Shorebird("Horned Puffin", 2, false, foodPref, WATER.RIVER, "great with children");
        BirdClass larry4 = new Waterfowl("Swan", 2, false, foodPref,WATER.FRESHWATER_SHORELANDS, "great with children");

        assertEquals(WATER.OCEAN,((Shorebird)larry).getBodyOfWater());
        assertEquals(WATER.LAKE,((Waterfowl)larry2).getBodyOfWater());
        assertEquals(WATER.RIVER,((Shorebird)larry3).getBodyOfWater());
        assertEquals(WATER.FRESHWATER_SHORELANDS,((Waterfowl)larry4).getBodyOfWater());

    }

    //=================================== Testing BirdEquality =======================================
    @Test
    public void TestBirdEquality() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry2 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");

        assertEquals(larry, larry2);

    }

    //=================================== Testing Bird toString =======================================


    @Test
    public void TestBirdToString() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        BirdClass bird1 = new BirdClass("Common Pigeon", 2, false, foodPref, "great with children");
        String toString = "The Common Pigeon is a type of Bird.\n" +
                "This Common Pigeon has 2 wings, and is not extinct.\n" +
                "This Common Pigeon's defining characteristic is: great with children.\n" +
                bird1.getFoodPrefString() ;
        assertEquals(toString, bird1.toString());

    }



}
