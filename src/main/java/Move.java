import java.util.List;
import java.util.ArrayList;

public class Move {
  private String mName;
  private String mPerformer;
  private static List<Move> mAllMoves = new ArrayList<Move>();

  public Move(String name, String performer){
    mName = name;
    mPerformer = performer;
    mAllMoves.add(this);
  }

  public static List<Move> all(){
    return mAllMoves;
  }

  // public static Move find(){
  //
  // }

  public static void clear(){
    mAllMoves.clear();
  }
}
