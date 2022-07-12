package Birds;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class aviaryTest {




    //=================================== Testing IsFull =======================================
    @Test
    public void TestFullAviary() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry2 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry3 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry4 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry5 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");


        AviaryClass aviary1 = new AviaryClass("HannafordAviary", AVIARY_TYPE.GENERAL, "Hannaford's parking lot");
        aviary1.addBird(larry);
        aviary1.addBird(larry2);
        aviary1.addBird(larry3);
        aviary1.addBird(larry4);
        assertEquals(false,aviary1.isFull());
        aviary1.addBird(larry5);
        assertEquals(5,aviary1.getSize());
        assertEquals(true,aviary1.isFull());
    }




    //=================================== Testing NumBird =======================================
    @Test
    public void TestNumBirds() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry2 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry3 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry4 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");



        AviaryClass aviary1 = new AviaryClass("HannafordAviary", AVIARY_TYPE.GENERAL, "Hannaford's parking lot");
        assertEquals(0,aviary1.getSize());
        aviary1.addBird(larry);
        assertEquals(1,aviary1.getSize());
        aviary1.addBird(larry2);
        assertEquals(2,aviary1.getSize());
        aviary1.addBird(larry3);
        assertEquals(3,aviary1.getSize());
        aviary1.addBird(larry4);
        assertEquals(4,aviary1.getSize());
    }

    //================================== Testing adding too many birds =======================================

    @Test(expected = IllegalStateException.class)
    public void TestTooManyBirds() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref,"great with children");
        BirdClass larry2 = new Pigeon("Common Pigeon", 2, false, foodPref,"great with children");
        BirdClass larry3 = new Pigeon("Common Pigeon", 2, false, foodPref,"great with children");
        BirdClass larry4 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry5 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry6 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");


        AviaryClass aviary1 = new AviaryClass("HannafordAviary", AVIARY_TYPE.GENERAL, "Hannaford's parking lot");
        aviary1.addBird(larry);
        aviary1.addBird(larry2);
        aviary1.addBird(larry3);
        aviary1.addBird(larry4);
        aviary1.addBird(larry5);
        aviary1.addBird(larry6);

    }

    //=================================== Testing bird of prey in general aviary =======================================
    @Test(expected = IllegalStateException.class)
    public void AviaryTypeTest() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new BirdOfPrey("Common Pigeon", 2, false, foodPref, "great with children");


        AviaryClass aviary1 = new AviaryClass("HannafordAviary", AVIARY_TYPE.GENERAL, "Hannaford's parking lot");
        assertEquals(0, aviary1.getSize());
        aviary1.addBird(larry);

    }


    //=================================== Testing Add bird of wrong type2 (pigeon in bird of prey aviary) =======================================


    @Test(expected = IllegalStateException.class)
    public void AviaryTypeTest2() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new BirdOfPrey("Eagle", 2, false, foodPref, "great with children");
        BirdClass larry2 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");

        AviaryClass aviary1 = new AviaryClass("HannafordAviary", AVIARY_TYPE.BIRDS_OF_PREY, "Hannaford's parking lot");
        assertEquals(0, aviary1.getSize());
        aviary1.addBird(larry);
        aviary1.addBird(larry2);
    }


    //=================================== Testing Aviary type/location/name =======================================
    @Test
    public void AviaryLocationNameTypeTest() {

        AviaryClass aviary1 = new AviaryClass("HannafordAviary", AVIARY_TYPE.BIRDS_OF_PREY, "Hannaford's parking lot");
        assertEquals("HannafordAviary",aviary1.getAviaryName());
        assertEquals("Hannaford's parking lot", aviary1.getAviaryLocation());
        assertEquals(AVIARY_TYPE.BIRDS_OF_PREY, aviary1.getType());
    }

//    @Test
//    public void AviaryLocationNameTypeTestTYPO() {
//
//        AviaryClass aviary1 = new AviaryClass(5, AVIARY_TYPE.BIRDS_OF_PREY, "Hannaford's parking lot");
//    }


    //=================================== Test PrintSign =======================================


















}
