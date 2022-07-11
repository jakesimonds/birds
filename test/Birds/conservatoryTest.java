package Birds;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;


public class conservatoryTest {

    // --------- TESTING: guestLookup() ---------------

        @Test
    public void TestGuestLookup() {
            //TODO: guest look up does not work for this case (can see best in conservatoryTest2 file)

            //building conservatory & food list
            ArrayList<FOOD> foodPref = new ArrayList<>();
            foodPref.add(FOOD.BERRIES);
            foodPref.add(FOOD.BUDS);


            BirdClass larry = new Pigeon("Larry", 2, false, foodPref, "great with children");
            BirdClass barry = new BirdOfPrey("Barry", 2, false, foodPref, "super smart");
            BirdClass gary = new Parrot("Gary", 2, 44, "idk", false, foodPref, "strong self esteem");
            BirdClass sherry = new Pigeon("Sherry", 2, false, foodPref, "strong self esteem");

            ConservatoryClass conservatory = new ConservatoryClass();

            conservatory.rescueBird(sherry);

            for (int i = 0; i < 14; i++) {
                conservatory.rescueBird(larry);
                conservatory.rescueBird(barry);
            }
            conservatory.rescueBird(gary);
            String str = conservatory.guestLookup("Sherry");
            assertEquals(true,str.contains("Sherry"));
            //assertEquals(true,str.contains("Aviary 1"));
        }

    //---------- TESTING: PrintMap ---------------

    @Test
    public void TestPrintMap() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Larry", 2, false, foodPref, "great with children");
        BirdClass barry = new BirdOfPrey("Barry", 2, false, foodPref, "super smart");
        BirdClass gary = new Parrot("Gary", 2, 44, "idk", false, foodPref, "strong self esteem");
        BirdClass sherry = new Pigeon("Sherry", 2, false, foodPref, "strong self esteem");

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



    // --------- TESTING: isFull() ---------------
    @Test
    public void ConservatoryTestIsFull() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Larry", 2, false, foodPref, "great with children");

        ConservatoryClass conservatory = new ConservatoryClass();

        for(int i = 0; i<99; i++){
            conservatory.rescueBird(larry);
        }
        assertEquals(false,conservatory.isFull());
        conservatory.rescueBird(larry);
        assertEquals(true,conservatory.isFull());


    }

    @Test(expected = IllegalStateException.class)
    public void ConservatoryTestTooMany() {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Larry", 2, false, foodPref,"great with children");

        ConservatoryClass conservatory = new ConservatoryClass();

        for(int i = 0; i<101; i++){
            conservatory.rescueBird(larry);
        }

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
