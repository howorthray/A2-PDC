
package Game;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author elanm
 */
public class GameManager {
    
    GameMode gm;
    ScriptHelper sh = new  ScriptHelper();
    int questionCount = 0;
    ArrayList<Integer> idArray;
    String possibleAnswer;
    Game game;

    
    public GameManager(GameMode gm){
//        this.questionCount = currentCount;
         this.gm = gm;
         idArray = this.gm.getQuestionId();
//         game = new Game();
//         this.getQuestion();
//         game.setVisible(true);
        playGame(gm.numQuestions());
    }
    
    public void playGame(int numQuestions){
        
        if(GameHelper.count < GameHelper.numGames){
             Game game = new Game();
             
             game.setQuestion(getQuestion());
             game.setOptA(getOptA());
             game.setOptB(getOptB());
             game.setOptC(getOptC());
             game.setOptD(getOptD());
             game.setAnswer(getAnswer());
             game.setProgess(GameHelper.count, GameHelper.numGames);
             game.setVisible(true);
             game.setLocationRelativeTo(null);
             
             GameHelper.increaseCounter();

        }
        else{
            JOptionPane.showMessageDialog(null, "Good job! You won " + GameHelper.gameMode.getReward());
            User.changeBalance(GameHelper.gameMode.getReward());
            User.setBalanceDB();
            GameHelper.resetCount();
            SelectGameMode gameModes = new SelectGameMode();
            gameModes.setVisible(true);
            gameModes.setLocationRelativeTo(null);
            
        }
    }
    
    public String getQuestion(){
        String question = "";
        int questionId = idArray.get(questionCount);
//        ResultSet rs = sh.getQuestion(questionId);
        ResultSet rs = sh.testExecuteQuery(questionId);
        try {
            while(rs.next()){
                question = rs.getString("QUESTION");
//                game.setQuestion(question);
                return question;
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return question;
    }
    
    public String getOptA(){
        String optA = "";
        int questionId = idArray.get(questionCount);
//        ResultSet rs = sh.getQuestion(questionId);
        ResultSet rs = sh.testExecuteQuery(questionId);
        try {
            while(rs.next()){
                optA = rs.getString("OPT_A");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //get question of idArray[questionCount]
        return optA;
    }
    
    public String getOptB(){
        String optB = "";
        int questionId = idArray.get(questionCount);
//        ResultSet rs = sh.getQuestion(questionId);
        ResultSet rs = sh.testExecuteQuery(questionId);
        try {
            while(rs.next()){
                optB = rs.getString("OPT_B");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return optB;
    }
    
    public String getOptC(){
        String optC = "";
        int questionId = idArray.get(questionCount);
//        ResultSet rs = sh.getQuestion(questionId);
        ResultSet rs = sh.testExecuteQuery(questionId);
        try {
            while(rs.next()){
                optC = rs.getString("OPT_C");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return optC;
    }
    
    public String getOptD(){
        String optD = "";
        int questionId = idArray.get(questionCount);
//        ResultSet rs = sh.getQuestion(questionId);
        ResultSet rs = sh.testExecuteQuery(questionId);
        try {
            while(rs.next()){
                optD = rs.getString("OPT_D");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return optD;
    }
    
    public String getAnswer(){
        String answer = "";
        int questionId = idArray.get(questionCount);
//        ResultSet rs = sh.getQuestion(questionId);
        ResultSet rs = sh.testExecuteQuery(questionId);
        try {
            while(rs.next()){
                answer = rs.getString("ANSWER");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return answer;
    }
    
    
    public void startGame(){
          
//        while(correct && this.questionCount < idArray.length ){
//             System.out.println("Game start: " + this.questionCount);
             Game game = new Game();
             
             game.setQuestion(getQuestion());
             game.setOptA(getOptA());
             game.setOptB(getOptB());
             game.setOptC(getOptC());
             game.setOptD(getOptD());
             game.setAnswer(getAnswer());
             game.setVisible(true);
             game.setLocationRelativeTo(null);
             
             
//             this.questionCount ++;
//            }
//            correct = false;
        }

    
    
    public boolean checkCorrect(){
        return false;
    }
}
