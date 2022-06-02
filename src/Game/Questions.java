package Game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Questions {
    
    ScriptHelper scriptHelper;
   private final String QuestionsFileName = "./resources/QuizQuestions.txt";
   private BufferedReader br = null;
   private FileReader fr = null;
   
   public Questions(){

        scriptHelper = new ScriptHelper();
        if(!scriptHelper.checkMaxQuestions()){
            this.readTextFile();
        }
   }
   
   //Reads the text file of the questions line by line and adds the values to the database
   public void readTextFile(){
       try {
           fr = new FileReader(QuestionsFileName);
           br = new BufferedReader(fr);
            String line = null;
            while((line = br.readLine()) != null){
                scriptHelper.executeScript("INSERT INTO QUESTIONS VALUES " + line);
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
        
   
    

