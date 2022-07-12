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



    BirdClass b1 = new Pigeon("Dove", 2, false, foodPref, "White nose");
    BirdClass b2 = new BirdOfPrey("Osprey", 2, false,foodPrefPrey, "Large, shiny talons");
    BirdClass b3 = new Parrot("Grey Parrot",2, 44, "idk",false,foodPrefParrot, "Shrill voice");
    BirdClass b4 = new Waterfowl("Duck", 2, false, foodPrefDuck, WATER.FRESHWATER_SHORELANDS, "Likes to swim");
    BirdClass b5 = new FlightlessBird("Kiwi", 1, false, foodPref, "Likes to sleep during the day");
    BirdClass b6 = new Owl("Barn Owl", foodPrefPrey, "Perhaps too wise");
    BirdClass b7 = new Shorebird("Great Puffin", 2, false, foodPrefDuck, WATER.OCEAN, "Thinks it's a penguin.");


    ConservatoryClass conservatory = new ConservatoryClass();

    for(int i = 0; i<2; i++){
      conservatory.rescueBird(b1);
      conservatory.rescueBird(b2);
      conservatory.rescueBird(b3);
      conservatory.rescueBird(b4);
      conservatory.rescueBird(b5);
      conservatory.rescueBird(b6);
      conservatory.rescueBird(b7);

    }

    System.out.println(conservatory.calculateFood());

    System.out.println("--------------------------------------");

    for (int j = 0; j < conservatory.getNumAviaries(); j++) {
      AviaryClass currentAviary = conservatory.getAviaryList().get(j);
      System.out.println(currentAviary.printSign());
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

      System.out.println(b6.getNumberOfWings());
      System.out.println(b6.getExtinct());
    }




  }
}
