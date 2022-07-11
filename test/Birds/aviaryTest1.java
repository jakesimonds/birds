package Birds;

import java.util.ArrayList;

public class aviaryTest1 {

    //trying to just build an aviary object


    public static void main(String[] args) {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass larry = new Pigeon("Larry", 2, false, foodPref, "great with children");
        BirdClass larry2 = new Pigeon("Larry", 2, false, foodPref, "great with children");
        BirdClass larry3 = new Pigeon("Larry", 2, false, foodPref, "great with children");
        BirdClass larry4 = new Pigeon("Larry", 2, false, foodPref, "great with children");
        BirdClass larry5 = new Pigeon("Larry", 2, false, foodPref, "great with children");


        AviaryClass aviary1 = new AviaryClass("HannafordAviary", AVIARY_TYPE.GENERAL, "Hannaford's parking lot");
        aviary1.addBird(larry);
        aviary1.addBird(larry2);
        aviary1.addBird(larry3);
        aviary1.addBird(larry4);
        aviary1.addBird(larry5);

        System.out.println(aviary1.toString());




        System.out.println(larry.toString());






    }
}
