package Game;

import java.util.ArrayList;

/**
 *
 * @author xzy8653
 */
public interface GameMode {
 
  public String getName();
  public int getBuyIn();
  public int numQuestions();
  public int getReward();
//  public Integer[] getQuestionId();
  public ArrayList getQuestionId();
            
}


