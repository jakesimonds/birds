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

    // TODO : Some tests
    // for each aviary, (for loop?) check that each field is as expected
    //  (including numBirds = 0, birdList exists but is empty)
  }

  // Test Conservatory Constructor Exception(s):
  // TODO : I don't think there are any exceptions to test for this constructor
  @Test
  public void TestAviaryConstructorExceptions(){
    ConservatoryClass conservatory = new ConservatoryClass();
  }




  //======================================== BIRD ============================================
  // Test Aviary Constructor:
  @Test
  public void TestBirdConstructor1(){
    AviaryClass aviary1 = new AviaryClass("Aviary #1", AVIARY_TYPE.GENERAL, "Campus A");
    AviaryClass aviary2 = new AviaryClass("Aviary #2", AVIARY_TYPE.FLIGHTLESS, "Campus B");

    // TODO : Some tests
    // for each bird, (for loop?) check that each field is as expected
    //  (including numBirds = 0, birdList exists but is empty)
  }

  // Test Conservatory Constructor Exception(s):
  // TODO : I don't think there are any exceptions to test for this constructor
  @Test
  public void TestBirdConstructor1Exceptions(){
    ConservatoryClass conservatory = new ConservatoryClass();
  }




}
