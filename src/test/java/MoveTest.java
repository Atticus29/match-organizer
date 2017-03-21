import org.junit.*;
import static org.junit.Assert.*;

public class MoveTest {
  public void MoveTest_instantiatesCorrectly_true(){
    Move testMove = new Move();
    assertEquals(true, testMove instanceof Move);
  }
}
