package Birds;

//this is just for print statement tests, we'll delete this class before submitting

import java.util.ArrayList;

public class BirdTest2 {


    public static void main(String[] args) {
        ArrayList<FOOD> foodPref = new ArrayList();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass barry = new Pigeon("Larry", 2, false, foodPref );

        System.out.println(barry.toString());






    }

}
