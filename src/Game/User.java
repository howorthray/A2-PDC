package Game;


import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class User {
    
    static String currentUser = "";
    static int userBalance = 0;
    
    static int getBalance(){
        ScriptHelper sh = new  ScriptHelper();
        int balance = 0;
//        ResultSet rs = sh.getQuestion(questionId);
        ResultSet rs = sh.balanceQuery(currentUser);
        try {
            while(rs.next()){
                balance = rs.getInt("BALANCE");
//                game.setQuestion(question);
                return balance;
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return balance;
    }
    
    static void setBalanceDB(){
        ScriptHelper sh = new  ScriptHelper();
        sh.executeScript("UPDATE USERS SET BALANCE = " + userBalance + " WHERE USER = '" + currentUser + "'");
        sh.closeConnection();
    }
    
    static void setCurrentUser(String user){
        currentUser = user;
    }
    
    static void changeBalance(int money){
        userBalance += money;
        if(userBalance < 0){
            userBalance = 0;
        }
    }
    
    static boolean checkBalance(int buyIn){
        if(userBalance >= buyIn){
            return true;
        }
        return false;
    }
}
    
    
