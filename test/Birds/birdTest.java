

package Birds;
import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;

public class birdTest {


    //public static void main(String[] args) {







        //test constructor, bird with 3/no wings
        @Test
        public void TestIllegalArg () throws Exception {
            ArrayList<FOOD> foodPref = new ArrayList();
            foodPref.add(FOOD.BERRIES);
            foodPref.add(FOOD.BUDS);

            BirdClass larry = new Pigeon("Larry", 3, false, foodPref );
            assertEquals(3, larry.getNumberOfWings());

        }


        @Test
    public void TestBirdEquality () {
        ArrayList<FOOD> foodPref = new ArrayList();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Larry", 0, false, foodPref );
        BirdClass larry2 = new Pigeon("Larry", 0, false, foodPref );

        assertEquals(larry, larry2);

    }


        //System.out.println(birdEx.toString());
        //this will be the bird test


    }
