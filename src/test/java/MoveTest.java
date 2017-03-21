import org.junit.*;
import static org.junit.Assert.*;

public class MoveTest {
  @Test
  public void MoveTest_instantiatesCorrectly_true(){
    Move testMove = new Move("scissor sweep", "Rafael Mendes");
    assertEquals(true, testMove instanceof Move);
  }

  @Test
  public void all_getsMoreThanOneMove_true(){
    Move testMove1 = new Move("mata leon", "Xande Ribeiro");
    Move testMove2 = new Move("berimbolo", "Andre Galvao");
    System.out.println(Move.all());
    assertTrue(Move.all().contains(testMove1));
    assertTrue(Move.all().contains(testMove2));
  }
}
