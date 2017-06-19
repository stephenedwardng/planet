import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class PlanetTest{

  Planet planet;

  @Before
  public void before(){
    planet = new Planet("Jupiter", 1000);
  }

  @Test
  public void hasName(){
    assertEquals("Jupiter", planet.getName());
  }

  @Test 
  public void hasAge(){
    assertEquals(1000, planet.getSize());
  }

  @Test
  public void testExplode(){
    assertEquals("Boom, Jupiter has exploded", planet.explode());
  }

}