package Game;

import java.util.ArrayList;

//Interface class for the 4 game modes.
public interface GameMode {
  public String getName();
  public int getBuyIn();
  public int numQuestions();
  public int getReward();
  public ArrayList getQuestionId();
}


