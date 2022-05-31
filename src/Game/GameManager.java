
package Game;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author elanm
 */
public class GameManager {
    
    GameMode game;
    ScriptHelper sh = new  ScriptHelper();
    int questionCount = 0;
    Integer[] idArray;
    String possibleAnswer;
    
    public GameManager(GameMode gm){
         game = gm;
         idArray = game.getQuestionId();
         startGame();
    }
    
    public String getQuestion(){
        String question = "";
        int questionId = idArray[questionCount];
//        ResultSet rs = sh.getQuestion(questionId);
        ResultSet rs = sh.testExecuteQuery(questionId);
        try {
            question = rs.getString("QUESTION");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //get question of idArray[questionCount]
        return question;
    }
    
    public String getOptA(){
        String optA = "";
        int questionId = idArray[questionCount];
//        ResultSet rs = sh.getQuestion(questionId);
        ResultSet rs = sh.testExecuteQuery(questionId);
        try {
            optA = rs.getString("OPT_A");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //get question of idArray[questionCount]
        return optA;
    }
    
    public String getOptB(){
        String optB = "";
        int questionId = idArray[questionCount];
//        ResultSet rs = sh.getQuestion(questionId);
        ResultSet rs = sh.testExecuteQuery(questionId);
        try {
            optB = rs.getString("OPT_B");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return optB;
    }
    
    public String getOptC(){
        String optC = "";
        int questionId = idArray[questionCount];
//        ResultSet rs = sh.getQuestion(questionId);
        ResultSet rs = sh.testExecuteQuery(questionId);
        try {
            optC = rs.getString("OPT_C");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return optC;
    }
    
    public String getOptD(){
        String optD = "";
        int questionId = idArray[questionCount];
//        ResultSet rs = sh.getQuestion(questionId);
        ResultSet rs = sh.testExecuteQuery(questionId);
        try {
            optD = rs.getString("OPT_D");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return optD;
    }
    
    public String getAnswer(){
        String answer = "";
        int questionId = idArray[questionCount];
//        ResultSet rs = sh.getQuestion(questionId);
        ResultSet rs = sh.testExecuteQuery(questionId);
        try {
            answer = rs.getString("ANSWER");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return answer;
    }
    
    
    public void startGame(){
        boolean correct = true;
        while(correct){
            for(int i = 0; i < idArray.length; i++){
                System.out.println("Game start: " + i);
                Game game = new Game();
                game.setQuestion(getQuestion());
                game.setOptA(getOptA());
                game.setOptB(getOptB());
                game.setOptC(getOptC());
                game.setOptD(getOptD());
                game.setAnswer(getAnswer());
                game.setVisible(true);
                game.setLocationRelativeTo(null);
            }
            correct = false;
        }
        //while boolean correct
        //for i =0 < idArray.length
        // Game newGame = new Game();
        //newGame.setOptA(this.getOptA());
        // questionCount++;
    }
    
    public boolean checkCorrect(){
        return false;
    }
}
