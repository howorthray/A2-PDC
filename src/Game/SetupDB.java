package Game;


public class SetupDB {

    ScriptHelper scriptHelper;


    public SetupDB() {

        scriptHelper = new ScriptHelper();
        addTables();
    }
    
    public void addTables(){

        if(!scriptHelper.checkTableExists("USERS")){
            scriptHelper.executeScript("CREATE  TABLE USERS  (USERNAME   VARCHAR(50),   PASSWORD   VARCHAR(20),   BALANCE   INT)");
        }
        if(!scriptHelper.checkTableExists("QUESTIONS")){
            scriptHelper.executeScript("CREATE  TABLE QUESTIONS  (QUESTION_ID   INT,   QUESTION   VARCHAR(255),   OPT_A   VARCHAR(50), OPT_B   VARCHAR(50), OPT_C  VARCHAR(50), OPT_D   VARCHAR(50), ANSWER  VARCHAR(50))");
        }
        scriptHelper.closeConnection();
    }

}
