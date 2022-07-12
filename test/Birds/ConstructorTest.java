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
      assertEquals(new ArrayList<BirdClass>(), currentAviary.getBirdList());
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
    // make ArrayList of food preferences:
    ArrayList<FOOD> foodPref = new ArrayList<>();
    foodPref.add(FOOD.EGGS);
    foodPref.add(FOOD.FRUIT);

    // make bird:
    BirdClass bird = new BirdClass("Moa", 2, true, foodPref, "No longer with us :(");

    // check that expected values for all fields are as expected:
    assertEquals("Moa", bird.getBirdName());
    assertEquals(2, bird.getNumberOfWings());
    assertTrue(bird.getExtinct());
    assertEquals(foodPref, bird.getFoodPreference());
    assertEquals("Bird", bird.getBirdType());
    assertEquals("No longer with us :(", bird.getBirdCharacteristic());
  }


  // Test Bird Constructor2 (assume not extinct):
  @Test
  public void TestBirdConstructor2(){
    // make ArrayList of food preferences:
    ArrayList<FOOD> foodPref = new ArrayList<>();
    foodPref.add(FOOD.AQUATIC_INVERTEBRATES);
    foodPref.add(FOOD.INSECTS);
    foodPref.add(FOOD.SEEDS);
    foodPref.add(FOOD.BUDS);

    // make bird:
    BirdClass bird = new BirdClass("Duck", 2, foodPref, "Loves to swim");

    // check that expected values for all fields are as expected:
    assertEquals("Duck", bird.getBirdName());
    assertEquals(2, bird.getNumberOfWings());
    assertFalse(bird.getExtinct());
    assertEquals(foodPref, bird.getFoodPreference());
    assertEquals("Bird", bird.getBirdType());
    assertEquals("Loves to swim", bird.getBirdCharacteristic());
  }


  // Test Bird Constructor3 (assume 2 wings):
  @Test
  public void TestBirdConstructor3(){
    // make ArrayList of food preferences:
    ArrayList<FOOD> foodPref = new ArrayList<>();
    foodPref.add(FOOD.BERRIES);
    foodPref.add(FOOD.BUDS);
    foodPref.add(FOOD.FRUIT);

    // make bird:
    BirdClass bird = new BirdClass("Fruit Bat", false, foodPref, "Thinks it's a bird");

    // check that expected values for all fields are as expected:
    assertEquals("Fruit Bat", bird.getBirdName());
    assertEquals(2, bird.getNumberOfWings());
    assertFalse(bird.getExtinct());
    assertEquals(foodPref, bird.getFoodPreference());
    assertEquals("Bird", bird.getBirdType());
    assertEquals("Thinks it's a bird", bird.getBirdCharacteristic());
  }


  // Test Bird Constructor4 (assume 2 wings & not extinct):
  @Test
  public void TestBirdConstructor4(){
    // make ArrayList of food preferences:
    ArrayList<FOOD> foodPref = new ArrayList<>();
    foodPref.add(FOOD.BERRIES);
    foodPref.add(FOOD.FRUIT);
    foodPref.add(FOOD.BUDS);

    // make bird:
    BirdClass bird = new BirdClass("Big Bird", foodPref, "Works at Sesame Street");

    // check that expected values for all fields are as expected:
    assertEquals("Big Bird", bird.getBirdName());
    assertEquals(2, bird.getNumberOfWings());
    assertFalse(bird.getExtinct());
    assertEquals(foodPref, bird.getFoodPreference());
    assertEquals("Bird", bird.getBirdType());
    assertEquals("Works at Sesame Street", bird.getBirdCharacteristic());
  }


  //=========================== Test Bird Constructor Exception(s): =============================
  @Test(expected = IllegalArgumentException.class)
  public void TestBirdConstructorFoodException1(){
    // test with too few food preferences:
    ArrayList<FOOD> foodPrefFew = new ArrayList<>();
    foodPrefFew.add(FOOD.BERRIES);
    BirdClass bird = new BirdClass("Bald Eagle", 2, false, foodPrefFew, "Bald");
  }
  @Test(expected = IllegalArgumentException.class)
  public void TestBirdConstructorFoodException2(){
    // test with too many food preferences:
    ArrayList<FOOD> foodPrefMany = new ArrayList<>();
    foodPrefMany.add(FOOD.BERRIES);
    foodPrefMany.add(FOOD.BUDS);
    foodPrefMany.add(FOOD.FISH);
    foodPrefMany.add(FOOD.EGGS);
    foodPrefMany.add(FOOD.SEEDS);
    BirdClass bird = new BirdClass("Bald Eagle", 2, false, foodPrefMany, "Bald");
  }
  @Test(expected = IllegalArgumentException.class)
  public void TestBirdConstructorWingsException1(){
    // test with too few (negative) wings:
    ArrayList<FOOD> foodPref = new ArrayList<>();
    foodPref.add(FOOD.BERRIES);
    foodPref.add(FOOD.BUDS);
    BirdClass bird = new BirdClass("Bald Eagle", -1, false, foodPref, "Bald");
  }
  @Test(expected = IllegalArgumentException.class)
  public void TestBirdConstructorWingsException2(){
    // test with too many (more than 3) wings:
    ArrayList<FOOD> foodPref = new ArrayList<>();
    foodPref.add(FOOD.BERRIES);
    foodPref.add(FOOD.BUDS);
    BirdClass bird = new BirdClass("Bald Eagle", 4, false, foodPref, "Bald");
  }



  //================================== BIRD OF PREY =======================================

  // Note that overloaded constructors for this class have already been tested in BirdConstructor tests.
  //
  // Mostly need to test that birdType is being initialized as expected:
  @Test
  public void TestBirdOfPreyConstructor(){
    // make ArrayList of food preferences:
    ArrayList<FOOD> foodPref = new ArrayList<>();
    foodPref.add(FOOD.OTHER_BIRDS);
    foodPref.add(FOOD.SMALL_MAMMALS);

    // make bird of prey:
    BirdOfPrey bird = new BirdOfPrey("Dragon", 2, true, foodPref, "Very large bird. Likes to eat naughty children");

    // check that expected values for all fields are as expected:
    assertEquals("Dragon", bird.getBirdName());
    assertEquals(2, bird.getNumberOfWings());
    assertTrue(bird.getExtinct());
    assertEquals(foodPref, bird.getFoodPreference());
    assertEquals("Bird of Prey", bird.getBirdType());
    assertEquals("Very large bird. Likes to eat naughty children", bird.getBirdCharacteristic());
    assertEquals("Birds of prey all have sharp, hooked beaks with visible nostrils.", bird.description);
  }



  //================================= FLIGHTLESS BIRD =====================================

  // Note that overloaded constructors for this class have already been tested in BirdConstructor tests.
  //
  // Mostly need to test that birdType is being initialized as expected:
  @Test
  public void TestFlightlessBirdConstructor(){
    // make ArrayList of food preferences:
    ArrayList<FOOD> foodPref = new ArrayList<>();
    foodPref.add(FOOD.EGGS);
    foodPref.add(FOOD.INSECTS);
    foodPref.add(FOOD.SEEDS);

    // make flightless bird:
    FlightlessBird bird = new FlightlessBird("Emu", foodPref, "Very large bird");

    // check that expected values for all fields are as expected:
    assertEquals("Emu", bird.getBirdName());
    assertEquals(2, bird.getNumberOfWings());
    assertFalse(bird.getExtinct());
    assertEquals(foodPref, bird.getFoodPreference());
    assertEquals("Flightless Bird", bird.getBirdType());
    assertEquals("Very large bird", bird.getBirdCharacteristic());
    assertEquals("Flightless birds live on the ground and have no (or undeveloped) wings. " +
            "They include the emus, kiwis, and moas. Some (but not all) of these birds are extinct.", bird.description);
  }



  //======================================= OWL ===========================================

  // Note that overloaded constructors for this class have already been tested in BirdConstructor tests.
  //
  // Mostly need to test that birdType is being initialized as expected:
  @Test
  public void TestOwlConstructor(){
    // make ArrayList of food preferences:
    ArrayList<FOOD> foodPref = new ArrayList<>();
    foodPref.add(FOOD.SMALL_MAMMALS);
    foodPref.add(FOOD.INSECTS);
    foodPref.add(FOOD.EGGS);

    // make owl:
    Owl bird = new Owl("Barn Owl", 2, foodPref, "Hangs out in a barn at night");

    // check that expected values for all fields are as expected:
    assertEquals("Barn Owl", bird.getBirdName());
    assertEquals(2, bird.getNumberOfWings());
    assertFalse(bird.getExtinct());
    assertEquals(foodPref, bird.getFoodPreference());
    assertEquals("Owl", bird.getBirdType());
    assertEquals("Hangs out in a barn at night", bird.getBirdCharacteristic());
    assertEquals("Owls are distinguished by the facial disks that frame the eyes and bill.", bird.description);
  }



  //====================================== PARROT =========================================

  // Note that overloaded constructors for this class have already been tested in BirdConstructor tests.
  //
  // Mostly need to test that birdType,  is being initialized as expected
  // ALSO need to check parrot-specific fields: knownWords, favoritePhrase
  @Test
  public void TestParrotConstructor(){
    // make ArrayList of food preferences:
    ArrayList<FOOD> foodPref = new ArrayList<>();
    foodPref.add(FOOD.FRUIT);
    foodPref.add(FOOD.INSECTS);
    foodPref.add(FOOD.BERRIES);
    int knownWords = 20;

    // make Parrot:
    Parrot bird = new Parrot("Grey Parrot", knownWords, "Let me get my banjo!", foodPref, "Cannot play the banjo");

    // check that expected values for all fields are as expected:
    assertEquals("Grey Parrot", bird.getBirdName());
    assertEquals(2, bird.getNumberOfWings());
    assertFalse(bird.getExtinct());
    assertEquals(foodPref, bird.getFoodPreference());
    assertEquals("Parrot", bird.getBirdType());
    assertEquals("Cannot play the banjo", bird.getBirdCharacteristic());
    assertEquals("Parrots have a short, curved beak and are known for their intelligence and ability to mimic sounds.", bird.description);
    // Parrot-Specific checks:
    assertEquals(knownWords, bird.getKnownWords());
    assertEquals("Let me get my banjo!", bird.getFavoritePhrase());
  }


  // Check Exceptions for Parrot Constructor (too many or too few known words):
  @Test(expected = IllegalArgumentException.class)
  public void TestParrotConstructorWordsException1(){
    // test with too few known words (< 0):
    ArrayList<FOOD> foodPref = new ArrayList<>();
    foodPref.add(FOOD.BERRIES);
    foodPref.add(FOOD.BUDS);
    Parrot bird = new Parrot("Grey Parrot", -1, "Mama Mia", foodPref, "Talks like Mario");
  }
  @Test(expected = IllegalArgumentException.class)
  public void TestParrotConstructorWordsException2(){
    // test with too many known words (> 100):
    ArrayList<FOOD> foodPref = new ArrayList<>();
    foodPref.add(FOOD.BERRIES);
    foodPref.add(FOOD.BUDS);
    Parrot bird = new Parrot("Grey Parrot", 101, "Mama Mia", foodPref, "Talks like Mario");
  }

  //====================================== PIGEON =========================================

  // Note that overloaded constructors for this class have already been tested in BirdConstructor tests.
  //
  // Mostly need to test that birdType is being initialized as expected:
  @Test
  public void TestPigeonConstructor(){
    // make ArrayList of food preferences:
    ArrayList<FOOD> foodPref = new ArrayList<>();
    foodPref.add(FOOD.SEEDS);
    foodPref.add(FOOD.NUTS);
    foodPref.add(FOOD.INSECTS);
    foodPref.add(FOOD.BERRIES);

    // make pigeon:
    Pigeon bird = new Pigeon("Passenger Pigeon", 2, true, foodPref, "Carries Mail to Heaven, now");

    // check that expected values for all fields are as expected:
    assertEquals("Passenger Pigeon", bird.getBirdName());
    assertEquals(2, bird.getNumberOfWings());
    assertTrue(bird.getExtinct());
    assertEquals(foodPref, bird.getFoodPreference());
    assertEquals("Pigeon", bird.getBirdType());
    assertEquals("Carries Mail to Heaven, now", bird.getBirdCharacteristic());
    assertEquals("Pigeons (or doves) are known for feeding their young \"bird milk\" " +
            "very similar to the milk of mammals. Found all over the world, " +
            "there are several varieties that are extinct.", bird.description);
  }



  //==================================== SHOREBIRD ========================================

  // TODO : special checks for bodyOfWater

  //==================================== WATER BIRD =======================================

  // TODO : special checks for bodyOfWater

  //===================================== WATERFOWL =======================================

  // TODO : special checks for bodyOfWater















}
