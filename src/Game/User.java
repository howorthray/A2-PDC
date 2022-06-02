package Game;


import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    
    static String currentUser = "";
    static int userBalance = 0;
    
    static int getBalance(){
        ScriptHelper sh = new  ScriptHelper();
        int balance = 0;
        //Gets users current balance from DB
        ResultSet rs = sh.balanceQuery(currentUser);
        try {
            while(rs.next()){
                balance = rs.getInt("BALANCE");
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
        sh.executeScript("UPDATE USERS SET BALANCE = " + userBalance + " WHERE USERNAME = '" + currentUser + "'");
    }
    
    static void setCurrentUser(String user){
        currentUser = user;
    }
    
    //Changes the the users balance
    static void changeBalance(int money){
        userBalance += money;
        if(userBalance < 0){
            userBalance = 0;
        }
    }
    
    //Checks to see if the user has enough money to play a level mode
    static boolean checkBalance(int buyIn){
        if(userBalance >= buyIn){
            return true;
        }
        return false;
    }
    
    //Resets balance to 0 for a new game/ new user
    static void resetBalance(){
        userBalance = 0;
    }
}
    
    
