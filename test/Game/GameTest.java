package Game;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
        
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        SetupDB u = new SetupDB();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testQuestionsTableCreation(){
        System.out.println("Testing questions table creation");
        SetupDB sdb = new SetupDB();
        ScriptHelper sh = new ScriptHelper();
        boolean questionsExists = sh.checkTableExists("QUESTIONS");
        boolean expectedResult = true;
        assertEquals(expectedResult, questionsExists);
    }
    
    @Test
    public void testUsersTableCreation(){
        System.out.println("Testing users table creation");
        SetupDB sdb = new SetupDB();
        ScriptHelper sh = new ScriptHelper();
        boolean usersExists = sh.checkTableExists("USERS");
        boolean expectedResult = true;
        assertEquals(expectedResult, usersExists);
    }
    
    @Test
    public void testChangeBalance(){
        System.out.println("Testing change balance");
        User.userBalance = 0;
        User.changeBalance(-10);
        int expectedResult = 0;
        assertEquals(expectedResult, User.userBalance);
    }
    
    @Test
    public void testCheckMaxQuestions(){
        System.out.println("Testing max questions");
        Questions questions = new Questions();
        ScriptHelper sh = new ScriptHelper();
        boolean expectedResult = true;
        boolean checkMax = sh.checkMaxQuestions();
        assertEquals(expectedResult, checkMax);
    }
    
    @Test
    public void testCheckBalance(){
        System.out.println("Testing check balance for Game Mode buy-ins");
        LevelTwo lvlTwo = new LevelTwo();
        User.userBalance = 100;
        int buyIn = lvlTwo.getBuyIn();
        boolean checkBalance = User.checkBalance(buyIn);
        boolean expectedResult = false;
        assertEquals(expectedResult, checkBalance);
    }
    
    @Test
    public void testResetBalance(){
        System.out.println("Testing reset balance");
        User.userBalance = 1000;
        User.resetBalance();
        int expectedResult = 0;
        assertEquals(expectedResult, User.userBalance);
        
    }
}

