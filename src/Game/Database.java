package Game;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xzy8653
 */
public class Database {
    
    private static final String USER_NAME = "pdc";
    private static final String PASSWORD = "pdc";
    private static final String URL = "jdbc:derby:QuizGameDB;create=true";

    Connection conn = null;
    
    public void DBsetup(){
        createTables();
    }
    
    public void createTables(){
        try{
            conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            Statement statement = conn.createStatement();
            
            if(!checkTableExists("USERS")){
                statement.executeUpdate("CREATE  TABLE USERS  (USERNAME   VARCHAR(50),   PASSWORD   VARCHAR(20),   BALANCE   INT, PRIMARY KEY USERNAME)");
            }
//            if(!checkTableExists("QUESTIONS")){
//                statement.executeUpdate("CREATE  TABLE QUESTIONS  (QUESTIONID   INT(10),   QUESTIONS   VARCHAR(255),   BALANCE   INT, PRIMARY KEY USERNAME)");
//            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean checkTableExists(String name){
        boolean exists = false;
        try{
            DatabaseMetaData dbmd = this.conn.getMetaData();
            String[] types = {"TABLE"};
            Statement statement;
            statement = this.conn.createStatement();
            ResultSet rs = dbmd.getTables(null, null, null, types);
            
            while(rs.next()){
                String table_name = rs.getString("TABLE_NAME");
                System.out.println(table_name);
                if(table_name.equalsIgnoreCase(name)){
                    exists = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exists;
    }
    
    public Connection getConnection(){
        return this.conn;
    }


}
