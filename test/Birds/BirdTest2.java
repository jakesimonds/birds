package Birds;

//this is just for print statement tests, we'll delete this class before submitting

import java.util.ArrayList;

public class BirdTest2 {


    public static void main(String[] args) {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);

        BirdClass barry = new Pigeon("Larry", 2, false, foodPref, "great with children" );

        BirdClass Pete = new Parrot("Pete", 2, 22, "Jumbo Shrimp", false, foodPref,"old as hell");

        BirdClass Pauly = new Shorebird("Pauly", 2, false, foodPref, WATER.SALTWATER_SHORELANDS,"real weird");
        BirdClass Nick = new Waterfowl("Nick", 2, false, foodPref, WATER.LAKE,"trustworthy");
        System.out.println(barry.toString());

        System.out.println(Pete.toString());
        System.out.println(Nick.toString());
        System.out.println(Pauly.toString());

        //System.out.println(barry.getFoodPrefString());












    }

}
