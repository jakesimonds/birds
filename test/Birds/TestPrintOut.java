package Birds;

import java.util.ArrayList;

public class TestPrintOut {

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
    BirdClass b3 = new Parrot("Grey Parrot", 44, "I am a parrot",false,foodPrefParrot, "Shrill voice");
    BirdClass b4 = new Waterfowl("Duck", 2, false, foodPrefDuck, WATER.FRESHWATER_SHORELANDS, "Likes to swim");
    BirdClass b5 = new FlightlessBird("Kiwi", 1, false, foodPref, "Likes to sleep during the day");
    BirdClass b6 = new Owl("Barn Owl", foodPrefPrey, "Perhaps too wise");
    BirdClass b7 = new Shorebird("Great Puffin", foodPrefDuck, WATER.OCEAN, "Thinks it's a penguin.");

    ConservatoryClass conservatory1 = new ConservatoryClass();


    conservatory1.rescueBird(b1);
    conservatory1.rescueBird(b2);
    conservatory1.rescueBird(b3);
    conservatory1.rescueBird(b4);
    conservatory1.rescueBird(b5);
    conservatory1.rescueBird(b6);
    conservatory1.rescueBird(b7);


    System.out.println("--------------------------------------");

    // Print out calculateFood:
    System.out.println("Calculate Food Test:\n");
    System.out.println(conservatory1.calculateFood());

    System.out.println("--------------------------------------");

    // Print out Guest Lookup:
    System.out.println("Guest Lookup Test:\n");
    System.out.println(conservatory1.guestLookup("Duck"));
    System.out.println(conservatory1.guestLookup("Great Puffin"));
    System.out.println(conservatory1.guestLookup("osprey"));
    System.out.println("Guest Lookup Test (Expected not found):\n");
    System.out.println(conservatory1.guestLookup("Chickadee"));

    System.out.println("--------------------------------------");

    // Print out printSign:
    System.out.println("Print Sign Test:\n");
    for (int j = 0; j < conservatory1.getNumAviaries(); j++) {
      AviaryClass currentAviary = conservatory1.getAviaryList().get(j);
      System.out.println(currentAviary.printSign());
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    System.out.println("--------------------------------------");

    // Print out printIndex
    System.out.println("Print Index Test:\n");
    System.out.println(conservatory1.printIndex());

    System.out.println("--------------------------------------");

    // Print out printMap
    System.out.println("Print Map Test:\n");
    System.out.println(conservatory1.printMap());

    System.out.println("--------------------------------------");



  }
}
