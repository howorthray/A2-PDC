
package Game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Questions {
    
   DBManager dbManager;
   Connection conn;
   Statement statement;
   private final String QuestionsFileName = "./resources/QuizQuestions.txt";
   private BufferedReader br = null;
   private FileReader fr = null;
   
   public Questions(){
       dbManager = new DBManager();
        conn = dbManager.getConnection();
        try {
            statement = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
   }
   
   public void  readTextFile(){
       try {
           fr = new FileReader(QuestionsFileName);
           br = new BufferedReader(fr);
            String line = null;
            while((line = br.readLine()) != null){
               try {
                   this.statement.addBatch("INSERT INTO QUESTIONS VALUES " + line );
               } catch (SQLException ex) {
                   Logger.getLogger(Questions.class.getName()).log(Level.SEVERE, null, ex);
               }

            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        if(br != null){
            try{
                br.close();
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        } 
   }
   
   public void addQuestions(){
         try {
            if(!checkTableExists("QUESTIONS")){
                this.statement.executeUpdate("CREATE  TABLE QUESTIONS  (QUESTION_ID   INT,   QUESTION   VARCHAR(50),   OPT_A   VARCHAR(50), OPT_B   VARCHAR(50), OPT_C  VARCHAR(50), OPT_D   VARCHAR(50), ANSWER  VARCHAR(50))");
            }
            
            
            this.statement.executeBatch();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        this.dbManager.closeConnections();
    }
   
   
   
   public boolean checkTableExists(String tableName) {
        boolean exists = false;
        try {
            DatabaseMetaData dbmd = this.conn.getMetaData();
            String[] types = {"TABLE"};
            Statement statement;
            statement = this.conn.createStatement();
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
   }
        
   
    

