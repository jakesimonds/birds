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

    BirdClass b1 = new Pigeon("Dove", 2, foodPref, "White nose");
    BirdClass b2 = new BirdOfPrey("Osprey", 2, false,foodPrefPrey, "Large, shiny talons");
    BirdClass b3 = new Parrot("Grey Parrot", 44, "idk",false,foodPrefParrot, "Shrill voice");
    BirdClass b4 = new Waterfowl("Duck", 2, false, foodPrefDuck, WATER.FRESHWATER_SHORELANDS, "Likes to swim");
    BirdClass b5 = new FlightlessBird("Kiwi", 1, false, foodPref, "Likes to sleep during the day");
    BirdClass b6 = new Owl("Barn Owl", foodPrefPrey, "Perhaps too wise");
    BirdClass b7 = new Shorebird("Great Puffin", foodPrefDuck, WATER.OCEAN, "Thinks it's a penguin.");

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
    System.out.println("Testing Guest Lookup:\n");
    System.out.println(conservatory.guestLookup("Duck"));

    System.out.println("--------------------------------------");

    for (int j = 0; j < conservatory.getNumAviaries(); j++) {
      AviaryClass currentAviary = conservatory.getAviaryList().get(j);
      System.out.println(currentAviary.printSign());
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

      /*
      System.out.println("B1 wingNum, extinct:");
      System.out.println(b1.getNumberOfWings());
      System.out.println(b1.getExtinct());

      System.out.println("B2 wingNum, extinct:");
      System.out.println(b2.getNumberOfWings());
      System.out.println(b2.getExtinct());

      System.out.println("B3 wingNum, extinct:");
      System.out.println(b3.getNumberOfWings());
      System.out.println(b3.getExtinct());

      System.out.println("B4 wingNum, extinct:");
      System.out.println(b4.getNumberOfWings());
      System.out.println(b4.getExtinct());

      System.out.println("B5 wingNum, extinct:");
      System.out.println(b5.getNumberOfWings());
      System.out.println(b5.getExtinct());

      System.out.println("B6 wingNum, extinct:");
      System.out.println(b6.getNumberOfWings());
      System.out.println(b6.getExtinct());

      System.out.println("B7 wingNum, extinct:");
      System.out.println(b7.getNumberOfWings());
      System.out.println(b7.getExtinct());

       */
    }




  }
}
