import org.junit.*;
import static org.junit.Assert.*;

public class MatchTest {
  @Test
  public void Match_instantiatesCorrectly_true(){
    Match testMatch = new Match();
    assertEquals(true, testMatch instanceof Match);
  }

  
}
