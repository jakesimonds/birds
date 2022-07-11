package Birds;

import java.util.ArrayList;

public class conservatoryTest2 {

    public static void main(String[] args) {
        ArrayList<FOOD> foodPref = new ArrayList<>();
        foodPref.add(FOOD.BERRIES);
        foodPref.add(FOOD.BUDS);
        ArrayList<FOOD> foodPrefPrey = new ArrayList<>();
        foodPrefPrey.add(FOOD.SMALL_MAMMALS);
        foodPrefPrey.add(FOOD.LARVAE);
        ArrayList<FOOD> foodPrefParrot = new ArrayList<>();
        foodPrefParrot.add(FOOD.INSECTS);
        foodPrefParrot.add(FOOD.LARVAE);

        BirdClass larry = new Pigeon("Larry", 2, false, foodPref,"Great with children");
        BirdClass barry = new BirdOfPrey("Barry", 2, false,foodPrefPrey,"super smart");
        BirdClass gary = new Parrot("Gary",2, 44, "idk",false,foodPrefParrot,"strong self esteem");
        BirdClass sherry = new Pigeon("Sherry", 2, false, foodPref, "strong self esteem");

        ConservatoryClass conservatory = new ConservatoryClass();

        conservatory.rescueBird(sherry);

        for(int i = 0; i<10; i++){
            conservatory.rescueBird(larry);
            conservatory.rescueBird(barry);
            conservatory.rescueBird(gary);
        }

        System.out.println(conservatory.calculateFood());

        System.out.println("--------------------------------------");

        System.out.println(conservatory.printIndex());

        System.out.println("--------------------------------------");

        System.out.println(conservatory.printMap());

        System.out.println(conservatory.guestLookup("Sherry"));





    }




}
