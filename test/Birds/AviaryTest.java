package Birds;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class AviaryTest {


    //=================================== Testing GetBirdList =======================================
    @Test
    public void TestGetBirdList() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry2 = new Owl("Barn Owl", 2, false, foodPref, "great with children");
        BirdClass larry3 = new Owl("House Owl", 2, false, foodPref, "great with children");
        BirdClass larry4 = new Pigeon("Uncommon Pigeon", 2, false, foodPref, "great with children");

        AviaryClass aviary1 = new AviaryClass("HannafordAviary", AVIARY_TYPE.GENERAL, "Hannaford's parking lot");
        aviary1.addBird(larry);
        aviary1.addBird(larry2);
        aviary1.addBird(larry3);
        aviary1.addBird(larry4);

        ArrayList AviaryList = aviary1.getBirdList();
        assertEquals(4, AviaryList.size());
        assertEquals(larry3, AviaryList.get(2));


    }

    //=================================== Testing getAviaryName =======================================
    @Test
    public void getAviaryNameTest() {

        AviaryClass aviary1 = new AviaryClass("HannafordAviary", AVIARY_TYPE.BIRDS_OF_PREY, "Hannaford's parking lot");
        assertEquals("HannafordAviary", aviary1.getAviaryName());
        assertEquals("Hannaford's parking lot", aviary1.getAviaryLocation());
        assertEquals(AVIARY_TYPE.BIRDS_OF_PREY, aviary1.getType());
    }

    //=================================== Testing getAviaryLocation =======================================
    @Test
    public void AviaryLocationTest() {

        AviaryClass aviary1 = new AviaryClass("HannafordAviary", AVIARY_TYPE.BIRDS_OF_PREY, "Campus 1");
        assertEquals("HannafordAviary", aviary1.getAviaryName());
        assertEquals("Campus 1", aviary1.getAviaryLocation());
        assertEquals(AVIARY_TYPE.BIRDS_OF_PREY, aviary1.getType());
    }

    //=================================== Testing getSize =======================================
    @Test
    public void TestGetSize() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry2 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry3 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry4 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");


        AviaryClass aviary1 = new AviaryClass("HannafordAviary", AVIARY_TYPE.GENERAL, "Hannaford's parking lot");
        assertEquals(0, aviary1.getSize());
        aviary1.addBird(larry);
        assertEquals(1, aviary1.getSize());
        aviary1.addBird(larry2);
        assertEquals(2, aviary1.getSize());
        aviary1.addBird(larry3);
        assertEquals(3, aviary1.getSize());
        aviary1.addBird(larry4);
        assertEquals(4, aviary1.getSize());
    }

    //=================================== Testing getType =======================================
    @Test
    public void AviaryTypeTest() {

        AviaryClass aviary1 = new AviaryClass("HannafordAviary", AVIARY_TYPE.BIRDS_OF_PREY, "Campus 1");
        assertEquals("HannafordAviary", aviary1.getAviaryName());
        assertEquals("Campus 1", aviary1.getAviaryLocation());
        assertEquals(AVIARY_TYPE.BIRDS_OF_PREY, aviary1.getType());
    }

    //================================== Testing addBird =======================================

    @Test(expected = IllegalStateException.class)
    public void TestTooManyBirds() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry2 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry3 = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
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

    //=================================== Testing printSign =======================================
    //TODO


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
        assertEquals(false, aviary1.isFull());
        aviary1.addBird(larry5);
        assertEquals(5, aviary1.getSize());
        assertEquals(true, aviary1.isFull());
    }


    //=================================== Testing isCompatible =======================================
    @Test(expected = IllegalStateException.class)
    public void AviaryisCompatibleTest() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new BirdOfPrey("Common Pigeon", 2, false, foodPref, "great with children");


        AviaryClass aviary1 = new AviaryClass("HannafordAviary", AVIARY_TYPE.GENERAL, "Hannaford's parking lot");
        assertEquals(0, aviary1.getSize());
        aviary1.addBird(larry);

    }

    @Test
    public void AviaryisCompatibleTest2() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new BirdOfPrey("Common Pigeon", 2, false, foodPref, "great with children");


        AviaryClass aviary1 = new AviaryClass("HannafordAviary", AVIARY_TYPE.GENERAL, "Hannaford's parking lot");
        assertEquals(false, aviary1.isCompatible(larry));

    }

    @Test(expected = IllegalStateException.class)
    public void AviaryisCompatibleTest3() {
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


    @Test
    public void testAviaryEquals() {
        String name1 = "Aviary 1";
        String location1 = "Campus A";
        AVIARY_TYPE type1 = AVIARY_TYPE.GENERAL;
        AVIARY_TYPE type2 = AVIARY_TYPE.FLIGHTLESS;

        AviaryClass a1 = new AviaryClass(name1, type1, location1);
        AviaryClass a2 = new AviaryClass(name1, type1, location1);
        AviaryClass a3 = new AviaryClass(name1 + "2", type1, location1);
        AviaryClass a4 = new AviaryClass(name1, type2, location1);

        assertEquals(a1, a2);
        assertNotEquals(a1, a3);
        assertNotEquals(a1, a4);
        assertNotEquals(a3, a4);



        // add some birds and check again:

        // make & add birds to aviaries:
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry2 = new Owl("Barn Owl", 2, false, foodPref, "great with children");

        a1.addBird(larry);
        a1.addBird(larry2);
        a2.addBird(larry);
        assertNotEquals(a1, a2);
        a2.addBird(larry2);
        assertEquals(a1, a2);


    }



    @Test
    public void testAviaryToString() {
        // make some aviaries:
        String name1 = "Aviary 1";
        String name2 = "Aviary 2";
        String location1 = "Campus A";
        String location2 = "Campus B";
        AVIARY_TYPE type1 = AVIARY_TYPE.GENERAL;
        AVIARY_TYPE type2 = AVIARY_TYPE.GENERAL;

        AviaryClass a1 = new AviaryClass(name1, type1, location1);
        AviaryClass a2 = new AviaryClass(name2, type2, location2);

        // make & add birds to aviaries:
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass larry2 = new Owl("Barn Owl", 2, false, foodPref, "great with children");

        a1.addBird(larry);
        a1.addBird(larry2);

        a2.addBird(larry);
        a2.addBird(larry);
        a2.addBird(larry);
        a2.addBird(larry);

        // test toString:
        String output1 = name1 + " is located on " + location1 + ".\nIt currently houses the following birds:\n";
        for (int i = 0; i < a1.getSize(); i++) {
            BirdClass currentBird = a1.getBirdList().get(i);
            output1 += "\t" + currentBird.getBirdName() + "\n";
        }
        assertEquals(output1, a1.toString());

        String output2 = name2 + " is located on " + location2 + ".\nIt currently houses the following birds:\n";
        for (int i = 0; i < a2.getSize(); i++) {
            BirdClass currentBird = a2.getBirdList().get(i);
            output2 += "\t" + currentBird.getBirdName() + "\n";
        }
        assertEquals(output2, a2.toString());
    }



}


