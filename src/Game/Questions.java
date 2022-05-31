
package Game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement; 


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
        this.readTextFile();
   }
   
   public void readTextFile(){
       try {
           fr = new FileReader(QuestionsFileName);
           br = new BufferedReader(fr);
            String line = null;
            while((line = br.readLine()) != null){
               try {
                   this.statement.executeUpdate("INSERT INTO QUESTIONS VALUES " + line );
               } catch (SQLException ex) {
                   System.out.println(ex.getMessage());
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
   
   
 
}
        
   
    

