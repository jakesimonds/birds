package Birds;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;


public class ConservatoryTest {

    //=================================== Testing getName =======================================

    @Test
    public void TestGetName(){
        ConservatoryClass conservatory = new ConservatoryClass();
        assertEquals("Jake & Nick's Bird Rescue Sanctuary", conservatory.getName());

    }

    //=================================== Testing getNumBirds =======================================
    @Test
    public void TestingGetNumBirds() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass barry = new BirdOfPrey("Hawk", 2, false, foodPref, "super smart");
        BirdClass Sarah = new FlightlessBird("Emu", 2, false, foodPref, "Large eyes");
        BirdClass Amelia = new Waterfowl("Geese", 2, false, foodPref, WATER.RIVER, "likes attention");
        BirdClass Emma = new Owl("Night Owl", 2, false, foodPref, "large talons");

        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");

        ConservatoryClass conservatory = new ConservatoryClass();
        //filling 5 aviaries with general birds
        for(int i = 0; i<25; i++){
            conservatory.rescueBird(Emma);
            assertEquals(i+1,conservatory.getNumBirds());
        }
        //now making it so 15 other aviaries aren't all full, but can't take general bird
        for(int i = 0; i<21; i++){
            conservatory.rescueBird(barry);
            assertEquals(i+26,conservatory.getNumBirds());
        }
        for(int i = 0; i<21; i++){
            conservatory.rescueBird(Amelia);
            assertEquals(i+47,conservatory.getNumBirds());
        }
        for(int i = 0; i<21; i++){
            conservatory.rescueBird(Sarah);
            assertEquals(i+68,conservatory.getNumBirds());
        }
        assertEquals(false,conservatory.isFull());
        assertEquals(88,conservatory.getNumBirds());


    }

    //=================================== Testing getNumAviaries =======================================

    @Test
    public void TestGetNumAviaries() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass barry = new BirdOfPrey("Eagle", 2, false, foodPref, "super smart");
        BirdClass gary = new Parrot("Grey Parrot", 2, 44, "idk", false, foodPref, "strong self esteem");
        BirdClass Sarah = new FlightlessBird("Kiwi", 2, false, foodPref, "Large eyes");
        BirdClass Emma = new Owl("Red Owl", 2, false, foodPref, "large talons");
        BirdClass Lucy = new Shorebird("African Jacana", 2, false, foodPref, WATER.FRESHWATER_SHORELANDS, "needs warm climate");
        BirdClass Amelia = new Waterfowl("Swan", 2, false, foodPref, WATER.RIVER, "likes attention");


        ConservatoryClass conservatory = new ConservatoryClass();
        assertEquals(0, conservatory.getNumAviaries());
        conservatory.rescueBird(larry);
        assertEquals(1, conservatory.getNumAviaries());
        conservatory.rescueBird(barry);
        assertEquals(2, conservatory.getNumAviaries());
        conservatory.rescueBird(Sarah);
        assertEquals(3, conservatory.getNumAviaries());
        conservatory.rescueBird(Amelia);
        //have added four birds that all need their own aviary
        assertEquals(4, conservatory.getNumAviaries());
        assertEquals(4, conservatory.getNumBirds());

    }

    //=================================== Testing guest look up =======================================

        @Test
    public void TestGuestLookup() {
            //building conservatory & food list
            ArrayList<FOOD> foodPref = new ArrayList<>();
            foodPref.add(FOOD.BERRIES);
            foodPref.add(FOOD.BUDS);


            BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
            BirdClass barry = new BirdOfPrey("Common Pigeon", 2, false, foodPref, "super smart");
            BirdClass gary = new Parrot("sulfer-crested cockatoo", 2, 44, "idk", false, foodPref, "strong self esteem");
            BirdClass sherry = new Pigeon("Maine Pigeon", 2, false, foodPref, "strong self esteem");

            ConservatoryClass conservatory = new ConservatoryClass();

            conservatory.rescueBird(sherry);

            for (int i = 0; i < 14; i++) {
                conservatory.rescueBird(larry);
                conservatory.rescueBird(barry);
            }
            conservatory.rescueBird(gary);
            String strSherry = conservatory.guestLookup("Maine Pigeon");
            String strFailure = conservatory.guestLookup("Failure");
            assertEquals(true,strSherry.contains("Maine"));
            assertEquals(true,strSherry.contains("Aviary #1"));
            assertEquals(true,strFailure.contains("404"));
        }

    //=================================== Testing PrintIndex =======================================
    @Test
    public void TestPrintIndex() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass barry = new BirdOfPrey("Hawk", 2, false, foodPref, "super smart");
        BirdClass gary = new Parrot("Sulfer-Crested Cockatoo", 2, 44, "idk", false, foodPref, "strong self esteem");
        BirdClass sherry = new Pigeon("Maine Pigeon", 2, false, foodPref, "strong self esteem");

        ConservatoryClass conservatory = new ConservatoryClass();

        conservatory.rescueBird(sherry);

        for (int i = 0; i < 14; i++) {
            conservatory.rescueBird(larry);
            conservatory.rescueBird(barry);
        }
        conservatory.rescueBird(gary);

        String strMap = conservatory.printMap();
        String strIndex = conservatory.printIndex();
        String strFood = conservatory.calculateFood();
        assertEquals(true,strIndex.contains("Aviary #7"));
        assertEquals(false,strIndex.contains("Aviary #8"));



    }


    //=================================== Testing PrintMap =======================================

    @Test
    public void TestPrintMap() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass barry = new BirdOfPrey("Hawk", 2, false, foodPref, "super smart");
        BirdClass gary = new Parrot("Sulfer-Crested Cockatoo", 2, 44, "idk", false, foodPref, "strong self esteem");
        BirdClass sherry = new Pigeon("Maine Pigeon", 2, false, foodPref, "strong self esteem");

        ConservatoryClass conservatory = new ConservatoryClass();

        conservatory.rescueBird(sherry);

        for (int i = 0; i < 14; i++) {
            conservatory.rescueBird(larry);
            conservatory.rescueBird(barry);
        }
        conservatory.rescueBird(gary);

        String strMap = conservatory.printMap();
        String strIndex = conservatory.printIndex();
        String strFood = conservatory.calculateFood();
        assertEquals(true,strMap.contains("Aviary #7"));
        assertEquals(false,strMap.contains("Aviary #8"));

        assertEquals(true,strFood.contains("BUDS"));
        //because 30 total birds with same diet
        assertEquals(true,strFood.contains("30"));



    }

    //=================================== Calculating food =======================================

    @Test
    public void TestCalculateFood() {
        ConservatoryClass conservatory = new ConservatoryClass();


        ArrayList<FOOD> foodPrefDuck = new ArrayList<>();
        foodPrefDuck.add(FOOD.NUTS);
        foodPrefDuck.add(FOOD.OTHER_BIRDS);
        foodPrefDuck.add(FOOD.SEEDS);
        foodPrefDuck.add(FOOD.VEGETATION);

        BirdClass Sarah = new FlightlessBird("Duck", 2, false, foodPrefDuck, "Large eyes");
        BirdClass Sarah2 = new FlightlessBird("Duck", 2, false, foodPrefDuck, "Large eyes");
        BirdClass Sarah3 = new FlightlessBird("Duck", 2, false, foodPrefDuck, "Large eyes");
        BirdClass Sarah4 = new FlightlessBird("Duck", 2, false, foodPrefDuck, "Large eyes");
        BirdClass Sarah5 = new FlightlessBird("Duck", 2, false, foodPrefDuck, "Large eyes");
        BirdClass Sarah6 = new FlightlessBird("Duck", 2, false, foodPrefDuck, "Large eyes");

        conservatory.rescueBird(Sarah);
        conservatory.rescueBird(Sarah2);
        conservatory.rescueBird(Sarah3);
        conservatory.rescueBird(Sarah4);
        conservatory.rescueBird(Sarah5);
        conservatory.rescueBird(Sarah6);

        String strFood = conservatory.calculateFood();

        assertEquals(true,strFood.contains("NUTS"));
        assertEquals(true,strFood.contains("OTHER_BIRDS"));
        assertEquals(true,strFood.contains("SEEDS"));
        //because 6 birds have same diet
        assertEquals(true,strFood.contains("6"));

    }

    //=================================== Testing rescueBird =======================================

    @Test
    public void RescueBirdTest() {
        ConservatoryClass conservatory = new ConservatoryClass();

        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "not extinct");
        assertEquals(0, conservatory.getNumBirds());
        assertEquals(0, conservatory.getNumAviaries());


        conservatory.rescueBird(larry);
        assertEquals(1, conservatory.getNumBirds());
        assertEquals(1, conservatory.getNumAviaries());

        String LookUpLarry = conservatory.guestLookup("Common Pigeon");
        assertEquals(true, LookUpLarry.contains("Common Pigeon"));
        assertEquals(true, LookUpLarry.contains("Aviary #1"));

    }





        //=================================== Testing getAviaryList =======================================


    @Test
    public void TestGetAviariesList() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass barry = new BirdOfPrey("Eagle", 2, false, foodPref, "super smart");
        BirdClass gary = new Parrot("Grey Parrot", 2, 44, "idk", false, foodPref, "strong self esteem");
        BirdClass Sarah = new FlightlessBird("Kiwi", 2, false, foodPref, "Large eyes");
        BirdClass Emma = new Owl("Red Owl", 2, false, foodPref, "large talons");
        BirdClass Lucy = new Shorebird("African Jacana", 2, false, foodPref, WATER.FRESHWATER_SHORELANDS, "needs warm climate");
        BirdClass Amelia = new Waterfowl("Swan", 2, false, foodPref, WATER.RIVER, "likes attention");


        ConservatoryClass conservatory = new ConservatoryClass();
        conservatory.rescueBird(larry);
        conservatory.rescueBird(barry);
        conservatory.rescueBird(Sarah);
        conservatory.rescueBird(Amelia);

        //have added four birds that all need their own aviary
        assertEquals(4, conservatory.getAviaryList().size());

    }



        //=================================== Testing isFull =======================================
    @Test
    public void ConservatoryTestIsFull() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");

        ConservatoryClass conservatory = new ConservatoryClass();

        for(int i = 0; i<99; i++){
            conservatory.rescueBird(larry);
        }
        assertEquals(false,conservatory.isFull());
        conservatory.rescueBird(larry);
        assertEquals(true,conservatory.isFull());

    }

    @Test(expected = IllegalStateException.class)
    public void ConservatoryTestIsFullNoRoomForPigeon() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass barry = new BirdOfPrey("Hawk", 2, false, foodPref, "super smart");
        BirdClass Sarah = new FlightlessBird("Emu", 2, false, foodPref, "Large eyes");
        BirdClass Amelia = new Waterfowl("Geese", 2, false, foodPref, WATER.RIVER, "likes attention");
        BirdClass Emma = new Owl("Night Owl", 2, false, foodPref, "large talons");

        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");

        ConservatoryClass conservatory = new ConservatoryClass();
        //filling 5 aviaries with general birds
        for(int i = 0; i<25; i++){
            conservatory.rescueBird(Emma);
        }
        //now making it so 15 other aviaries aren't all full, but can't take general bird
        for(int i = 0; i<21; i++){
            conservatory.rescueBird(barry);
        }
        for(int i = 0; i<21; i++){
            conservatory.rescueBird(Amelia);
        }
        for(int i = 0; i<21; i++){
            conservatory.rescueBird(Sarah);
        }
        assertEquals(false,conservatory.isFull());
        assertEquals(88,conservatory.getNumBirds());
        conservatory.rescueBird(larry);

    }
    //=================================== Testing overfilling generates error =======================================
    @Test(expected = IllegalStateException.class)
    public void ConservatoryTestTooMany() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref,"great with children");

        ConservatoryClass conservatory = new ConservatoryClass();

        for(int i = 0; i<101; i++){
            conservatory.rescueBird(larry);
        }

    }

    //=================================== Testing AviaryListIsFull =======================================
    @Test
    public void AviaryListIsFullTest() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");

        ConservatoryClass conservatory = new ConservatoryClass();

        for(int i = 0; i<95; i++){
            conservatory.rescueBird(larry);
        }
        assertEquals(false,conservatory.aviaryListFull());
        conservatory.rescueBird(larry);
        assertEquals(true,conservatory.aviaryListFull());

    }



    @Test
    public void TestConservatoryToString() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");

        ConservatoryClass c1 = new ConservatoryClass();
        String toString = "Jake & Nick's Bird Rescue Sanctuary is a Conservatory" +
                " currently comprised of 0 Aviaries.\nIt currently houses 0 birds.\n";
        assertEquals(toString, c1.toString());

        c1.rescueBird(larry);
        c1.rescueBird(larry);
        c1.rescueBird(larry);

        String toStringLarry1 = "Jake & Nick's Bird Rescue Sanctuary is a Conservatory" +
                " currently comprised of 1 Aviaries.\nIt currently houses 3 birds.\n";
        assertEquals(toStringLarry1, c1.toString());

        c1.rescueBird(larry);
        c1.rescueBird(larry);
        c1.rescueBird(larry);

        String toStringLarry2 = "Jake & Nick's Bird Rescue Sanctuary is a Conservatory" +
                " currently comprised of 2 Aviaries.\nIt currently houses 6 birds.\n";
        assertEquals(toStringLarry2, c1.toString());

    }


    @Test
    public void testConservatoryEquals() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Jake & Nick's Bird Rescue Sanctuary", 2, false, foodPref, "great with children");

        ConservatoryClass c1 = new ConservatoryClass();
        ConservatoryClass c2 = new ConservatoryClass();

        assertEquals(c1, c2);
        assertNotEquals(c1, larry);
        assertNotEquals(c2, larry);

    }

    //              NOTE THAT PRIVATE METHODS addAviary() and makeAviary()
    //              are tested in all cases where rescueBird() is called



    //----------------NOW TESTING MULTIPLE METHODS ON DIFFERENT CONSERVATORY SITUATIONS--------------------


    //=================================== Oneofeverykind =======================================
    @Test
    public void OneOfEveryKind() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass barry = new BirdOfPrey("Eagle", 2, false, foodPref, "super smart");
        BirdClass gary = new Parrot("Grey Parrot", 2, 44, "idk", false, foodPref, "strong self esteem");
        BirdClass Sarah = new FlightlessBird("Kiwi", 2, false, foodPref, "Large eyes");
        BirdClass Emma = new Owl("Red Owl", 2, false, foodPref, "large talons");
        BirdClass Lucy = new Shorebird("African Jacana", 2, false, foodPref, WATER.FRESHWATER_SHORELANDS, "needs warm climate");
        BirdClass Amelia = new Waterfowl("Swan", 2, false, foodPref, WATER.RIVER, "likes attention");


        ConservatoryClass conservatory = new ConservatoryClass();
        conservatory.rescueBird(larry);
        conservatory.rescueBird(barry);
        conservatory.rescueBird(Sarah);
        conservatory.rescueBird(Amelia);
        //have added four birds that all need their own aviary
        assertEquals(4, conservatory.getNumAviaries());
        assertEquals(4, conservatory.getNumBirds());

        conservatory.rescueBird(Emma);
        conservatory.rescueBird(Lucy);
        conservatory.rescueBird(gary);
        //added three more birds, but they can fit into existing aviaries
        assertEquals(7, conservatory.getNumBirds());
        assertEquals(4, conservatory.getNumAviaries());

    }


    //=================================== Every kind of food =======================================

    @Test
    public void AllFoods() {
        ConservatoryClass conservatory = new ConservatoryClass();

        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        foodPref.add(FOOD.AQUATIC_INVERTEBRATES);
        ArrayList<FOOD> foodPrefPrey = new ArrayList<>();
        foodPrefPrey.add(FOOD.SMALL_MAMMALS);
        foodPrefPrey.add(FOOD.LARVAE);
        foodPrefPrey.add(FOOD.FRUIT);
        ArrayList<FOOD> foodPrefParrot = new ArrayList<>();
        foodPrefParrot.add(FOOD.INSECTS);
        foodPrefParrot.add(FOOD.EGGS);
        foodPrefParrot.add(FOOD.FISH);
        ArrayList<FOOD> foodPrefDuck = new ArrayList<>();
        foodPrefDuck.add(FOOD.NUTS);
        foodPrefDuck.add(FOOD.OTHER_BIRDS);
        foodPrefDuck.add(FOOD.SEEDS);
        foodPrefDuck.add(FOOD.VEGETATION);

        BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "great with children");
        BirdClass barry = new BirdOfPrey("Hawk", 2, false, foodPrefPrey, "super smart");
        BirdClass gary = new Parrot("Grey Parrot", 2, 44, "idk", false, foodPrefParrot, "strong self esteem");
        BirdClass Sarah = new FlightlessBird("Kiwi", 2, false, foodPrefDuck, "Large eyes");

        conservatory.rescueBird(larry);
        conservatory.rescueBird(barry);
        conservatory.rescueBird(gary);
        conservatory.rescueBird(Sarah);

        String strFood = conservatory.calculateFood();

        assertEquals(true,strFood.contains("NUTS"));
        assertEquals(true,strFood.contains("OTHER_BIRDS"));
        assertEquals(true,strFood.contains("VEGETATION"));
        assertEquals(true,strFood.contains("SEEDS"));
        assertEquals(true,strFood.contains("LARVAE"));
        //because every type of food should have just 1 bird that needs it
        assertEquals(true,strFood.contains("1"));

    }


    //=================================== Empty Conservatory =======================================

    @Test
    public void EmptyConservatory() {
        ConservatoryClass conservatory = new ConservatoryClass();

        //just showing it doesn't crash
        conservatory.calculateFood();
        conservatory.printIndex();
        conservatory.printMap();
        conservatory.guestLookup("BirdThatIsntThere");


        assertEquals(0,conservatory.getNumBirds());
        assertEquals(0,conservatory.getNumAviaries());


    }

    //=================================== One Bird =======================================

        @Test
        public void OneBird() {
            ConservatoryClass conservatory = new ConservatoryClass();

            ArrayList<FOOD> foodPref = new ArrayList<>();
            foodPref.add(FOOD.BERRIES);
            foodPref.add(FOOD.BUDS);


            BirdClass larry = new Pigeon("Common Pigeon", 2, false, foodPref, "not extinct");
            assertEquals(0,conservatory.getNumBirds());
            assertEquals(0,conservatory.getNumAviaries());

            conservatory.rescueBird(larry);

            assertEquals(1,conservatory.getNumBirds());
            assertEquals(1,conservatory.getNumAviaries());

        }


    //=================================== Rescue Extinct Bird =======================================

    @Test(expected = IllegalStateException.class)
    public void RescueExtinctBird() {
        ConservatoryClass conservatory = new ConservatoryClass();

        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Common Pigeon", 2, true, foodPref, "extinct pigeon");

        conservatory.rescueBird(larry);

    }




}
