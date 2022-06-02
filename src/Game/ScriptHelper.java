package Game;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScriptHelper {
    
    DBManager database;
    Connection conn;
    Statement statement;
    
    public ScriptHelper(){
        database = new DBManager();
        conn = database.getConnection();
    }
    
    public Connection getConnection(){
        return this.conn;
    }
    
    //executes a string that allows it to access the database
    public void executeScript(String input){
        try{
            statement = this.conn.createStatement();
            statement.executeUpdate(input);
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void closeConnection() {
        this.database.closeConnections();
    }
    
    //Returns a boolean value on wether the table is in the database
    public boolean checkTableExists(String tableName) {
        boolean exists = false;
        try {
            DatabaseMetaData dbmd = this.conn.getMetaData();
            String[] types = {"TABLE"};
            ResultSet rs = dbmd.getTables(null, null, null, types);

            while (rs.next()) {
                String table_name = rs.getString("TABLE_NAME");
                System.out.println(table_name);
                if (table_name.equalsIgnoreCase(tableName)) {
                    exists = true;
                }
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return exists;
    }
    
    //returns a boolean value to check if the max number of questions have been added to the table 
   public boolean checkMaxQuestions(){
        boolean max = true;
        int counter = 0;
        int total = 75;
        Connection conn = null;
        Statement statement = null;
        String DBQ = "SELECT * FROM QUESTIONS";
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby:QuizGameDB_Edb; create=true", "pdc", "pdc");
            
            statement = conn.createStatement();
            
            rs = statement.executeQuery(DBQ);
            while(rs.next()){
                counter++;
                }
            } 
        catch(Exception e){
            System.err.println(e);
            System.out.println(e.getMessage());
        }
        if(counter == total){
            return true;
        }
        return false;
    }
    
   //???????
    public ResultSet testExecuteQuery(int query){
        Connection conn = null;
        Statement statement = null;
        String DBQ = "SELECT * FROM QUESTIONS WHERE QUESTION_ID = " + query;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby:QuizGameDB_Edb; create=true", "pdc", "pdc");
            statement = conn.createStatement();
            rs = statement.executeQuery(DBQ);
        } 
        catch(Exception e){
            System.err.println(e);
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    //Excutes SQL function that returns the value of the USER table 
    public ResultSet balanceQuery(String user){
        Connection conn = null;
        Statement statement = null;
        String DBQ = "SELECT * FROM USERS WHERE USER = " + user;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby:QuizGameDB_Edb; create=true", "pdc", "pdc");
            statement = conn.createStatement();
            rs = statement.executeQuery(DBQ);
        } 
        catch(Exception e){
            System.err.println(e);
            System.out.println(e.getMessage());
        }
        return rs;
    }
}
