package Game;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GameManager {
    
    GameMode gm;
    ScriptHelper sh = new  ScriptHelper();
    int questionCount = 0;
    ArrayList<Integer> idArray;
    String possibleAnswer;
    GameJFrameForm game;

    
    public GameManager(GameMode gm){
        this.gm = gm;
        idArray = this.gm.getQuestionId();
        playGame(gm.numQuestions());
    }
    
    //Checks if the user has answered all the questions. Then set the varibles for the questiosn, options and progress. Then increase the count of the number of questiosn answered.
    //Else it closes the game window and shows a congratulatory message, updates the users balance, resets the count and then ones up a new select GameMode window 
    public void playGame(int numQuestions){
        
        if(GameHelper.count < GameHelper.numGames){
             GameJFrameForm game = new GameJFrameForm();
             
             //setting all the question button text appropiately
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
            //instance when user gets all the questions right
            JOptionPane.showMessageDialog(null, "Good job! You won $" + GameHelper.gameMode.getReward());
            
            //updates current balance
            User.changeBalance(GameHelper.gameMode.getReward());
            //updates balance in database for current user
            User.setBalanceDB();
            GameHelper.resetCount();
            SelectGameModeJFrameForm gameModes = new SelectGameModeJFrameForm();
            gameModes.setVisible(true);
            gameModes.setLocationRelativeTo(null);
            
        }
    }
    
    //gets the question form the database base of the idarray
    public String getQuestion(){
        String question = "";
        int questionId = idArray.get(questionCount);
        ResultSet rs = sh.executeQuestionQuery(questionId);
        try {
            while(rs.next()){
                question = rs.getString("QUESTION");
                return question;
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return question;
    }
    
    //gets the option A form the database base of the idarray
    public String getOptA(){
        String optA = "";
        int questionId = idArray.get(questionCount);
        ResultSet rs = sh.executeQuestionQuery(questionId);
        try {
            while(rs.next()){
                optA = rs.getString("OPT_A");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return optA;
    }
    
    //gets the option B form the database base of the idarray
    public String getOptB(){
        String optB = "";
        int questionId = idArray.get(questionCount);
        ResultSet rs = sh.executeQuestionQuery(questionId);
        try {
            while(rs.next()){
                optB = rs.getString("OPT_B");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return optB;
    }
    
    //gets the option C form the database base of the idarray
    public String getOptC(){
        String optC = "";
        int questionId = idArray.get(questionCount);
        ResultSet rs = sh.executeQuestionQuery(questionId);
        try {
            while(rs.next()){
                optC = rs.getString("OPT_C");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return optC;
    }
    
    //gets the option D form the database base of the idarray
    public String getOptD(){
        String optD = "";
        int questionId = idArray.get(questionCount);
        ResultSet rs = sh.executeQuestionQuery(questionId);
        try {
            while(rs.next()){
                optD = rs.getString("OPT_D");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return optD;
    }
    
    //gets the answer form the database base of the idarray
    public String getAnswer(){
        String answer = "";
        int questionId = idArray.get(questionCount);
        ResultSet rs = sh.executeQuestionQuery(questionId);
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
             GameJFrameForm game = new GameJFrameForm();
             
             game.setQuestion(getQuestion());
             game.setOptA(getOptA());
             game.setOptB(getOptB());
             game.setOptC(getOptC());
             game.setOptD(getOptD());
             game.setAnswer(getAnswer());
             game.setVisible(true);
             game.setLocationRelativeTo(null);
        }

}
