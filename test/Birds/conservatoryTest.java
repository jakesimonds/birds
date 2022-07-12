package Birds;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;


public class conservatoryTest {

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
    //=================================== Testing isFull & beyond =======================================
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

    //----------------NOW TESTING MULTIPLE METHODS ON DIFFERENT CONSERVATORY SITUATIONS--------------------


    //=================================== 1 of every kind of bird =======================================
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





//    @Test(expected = IllegalStateException.class)
//    public void ConservatoryTestDifferentBirds() {
//        ArrayList<FOOD> foodPref = new ArrayList<>();
//        foodPref.add(FOOD.BERRIES);
//        foodPref.add(FOOD.BUDS);
//        ArrayList<FOOD> foodPrefPrey = new ArrayList<>();
//        foodPrefPrey.add(FOOD.SMALL_MAMMALS);
//        foodPrefPrey.add(FOOD.LARVAE);
//        ArrayList<FOOD> foodPrefParrot = new ArrayList<>();
//        foodPrefParrot.add(FOOD.INSECTS);
//        foodPrefParrot.add(FOOD.LARVAE);
//
//        BirdClass larry = new Pigeon("Larry", 2, false, foodPref, "great with children");
//        BirdClass barry = new BirdOfPrey("Barry", 2, false,foodPrefPrey,"super smart");
//        BirdClass gary = new Parrot("Gary",2, 44, "idk",false,foodPrefParrot,"strong self esteem");
//
//        ConservatoryClass conservatory = new ConservatoryClass();
//
//        for(int i = 0; i<30; i++){
//            conservatory.rescueBird(larry);
//            conservatory.rescueBird(larry);
//            conservatory.rescueBird(larry);
//        }
//
//    }


    //alphabetical: can name two bird AAA & ZZZ, call their names by index or something




}
