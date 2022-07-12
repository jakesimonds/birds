package Birds;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;


public class ConstructorTest {

  //=================================== CONSERVATORY =======================================
  @Test
  public void TestConservatoryConstructor(){
    ConservatoryClass conservatory = new ConservatoryClass();
    // check that values for name, numAviaries, & aviaryList are as expected:
    assertEquals("Jake & Nick's Bird Rescue Sanctuary", conservatory.getName());
    assertEquals(0, conservatory.getNumAviaries());
    assertEquals(new ArrayList<AviaryClass>(), conservatory.getAviaryList());
  }




  //====================================== AVIARY ==========================================
  // Test Aviary Constructor:
  @Test
  public void TestAviaryConstructor(){
    AviaryClass aviary1 = new AviaryClass("Aviary #1", AVIARY_TYPE.GENERAL, "Campus A");
    AviaryClass aviary2 = new AviaryClass("Aviary #2", AVIARY_TYPE.FLIGHTLESS, "Campus B");
    AviaryClass aviary3 = new AviaryClass("Aviary #3", AVIARY_TYPE.BIRDS_OF_PREY, "Campus C");
    AviaryClass aviary4 = new AviaryClass("Aviary #4", AVIARY_TYPE.WATER_BIRDS, "Campus D");

    // add each new aviary to an ArrayList:
    ArrayList<AviaryClass> aviaryList = new ArrayList<>();
    aviaryList.add(aviary1);
    aviaryList.add(aviary2);
    aviaryList.add(aviary3);
    aviaryList.add(aviary4);


    // For each aviary, check that each field is as expected:
    //  (including numBirds = 0, birdList exists but is empty)
    for (int i = 0; i < aviaryList.size(); i++) {
      AviaryClass currentAviary = aviaryList.get(i);
      // check name, location, numBirds, birdList:
      assertEquals("Aviary #" + (i+1), currentAviary.getAviaryName());
      assertEquals("Campus " + (char)(65 + i), currentAviary.getAviaryLocation());
      assertEquals(0, currentAviary.getSize());
      assertEquals(new ArrayList<AviaryClass>(), currentAviary.getBirdList());
      // use switch statement to check type:
      switch(currentAviary.getAviaryName()) {
        case "Aviary #1":
          assertEquals(AVIARY_TYPE.GENERAL, currentAviary.getType());
          break;
        case "Aviary #2":
          assertEquals(AVIARY_TYPE.FLIGHTLESS, currentAviary.getType());
          break;
        case "Aviary #3":
          assertEquals(AVIARY_TYPE.BIRDS_OF_PREY, currentAviary.getType());
          break;
        case "Aviary #4":
          assertEquals(AVIARY_TYPE.WATER_BIRDS, currentAviary.getType());
          break;
      }
    }
  }





  //======================================== BIRD ============================================
  // Test Bird Constructor1:
  @Test
  public void TestBirdConstructor1(){
    // make some ArrayLists of food preferences:
    ArrayList<FOOD> foodPref1 = new ArrayList<>();
    foodPref1.add(FOOD.AQUATIC_INVERTEBRATES);
    foodPref1.add(FOOD.INSECTS);
    foodPref1.add(FOOD.SEEDS);
    foodPref1.add(FOOD.BUDS);

    ArrayList<FOOD> foodPref2 = new ArrayList<>();
    foodPref2.add(FOOD.EGGS);
    foodPref2.add(FOOD.FRUIT);

    // make some birds:
    BirdClass bird1 = new BirdClass("Duck", 2, false, foodPref1, "Loves to swim");
    BirdClass bird2 = new BirdClass("Moa", 2, true, foodPref2, "No longer with us :(");

    // check that expected values for all fields are as expected:
    assertEquals("Duck", bird1.getBirdName());
    assertEquals(2, bird1.getNumberOfWings());
    assertEquals(false, bird1.getExtinct());
    assertEquals(foodPref1, bird1.getFoodPreference());
    assertEquals("Loves to swim", bird1.getBirdCharacteristic());


    assertEquals("Moa", bird2.getBirdName());
    assertEquals(2, bird2.getNumberOfWings());
    assertEquals(true, bird2.getExtinct());
    assertEquals(foodPref2, bird2.getFoodPreference());
    assertEquals("No longer with us :(", bird2.getBirdCharacteristic());






  }

  // Test Bird Constructor1 Exception(s):
  // TODO : I don't think there are any exceptions to test for this constructor
  @Test(expected = IllegalArgumentException.class)
  public void TestBirdConstructor1FoodException1(){
    // test with too few food preferences:
    ArrayList<FOOD> foodPrefFew = new ArrayList<>();
    foodPrefFew.add(FOOD.BERRIES);
    BirdClass bird = new BirdClass("Bald Eagle", 2, false, foodPrefFew, "Bald");
  }
  @Test(expected = IllegalArgumentException.class)
  public void TestBirdConstructor1FoodException2(){
    // test with too many food preferences:
    ArrayList<FOOD> foodPrefMany = new ArrayList<>();
    foodPrefMany.add(FOOD.BERRIES);
    foodPrefMany.add(FOOD.BUDS);
    foodPrefMany.add(FOOD.FISH);
    foodPrefMany.add(FOOD.EGGS);
    foodPrefMany.add(FOOD.SEEDS);
    BirdClass bird = new BirdClass("Bald Eagle", 2, false, foodPrefMany, "Bald");
  }






}
