package Birds;

import java.util.ArrayList;

public class nickTest {

  public static void main(String args[]) {
    //
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



    BirdClass larry = new Pigeon("Larry", 2, false, foodPref);
    BirdClass barry = new BirdOfPrey("Barry", 2, false,foodPrefPrey);
    BirdClass gary = new Parrot("Gary",2, 44, "idk",false,foodPrefParrot);
    BirdClass harry = new Waterfowl("Harry", 2, false, foodPrefDuck, WATER.FRESHWATER_SHORELANDS);


    ConservatoryClass conservatory = new ConservatoryClass();

    for(int i = 0; i<25; i++){
      conservatory.rescueBird(larry);
      conservatory.rescueBird(barry);
      conservatory.rescueBird(gary);
      conservatory.rescueBird(harry);

    }

    System.out.println(conservatory.calculateFood());

    System.out.println("--------------------------------------");
  }
}
