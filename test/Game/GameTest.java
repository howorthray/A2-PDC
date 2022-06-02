package Game;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
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
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testInsertUser(){
        System.out.println("Testing inserting user into DB");
        
    }
    /**
     * Test of setOptA method, of class Game.
     */
    @Test
    public void testSetOptA() {
        System.out.println("setOptA");
        String questionOptA = "";
        Game instance = new Game();
        instance.setOptA(questionOptA);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOptB method, of class Game.
     */
    @Test
    public void testSetOptB() {
        System.out.println("setOptB");
        String optB = "";
        Game instance = new Game();
        instance.setOptB(optB);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOptC method, of class Game.
     */
    @Test
    public void testSetOptC() {
        System.out.println("setOptC");
        String optC = "";
        Game instance = new Game();
        instance.setOptC(optC);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOptD method, of class Game.
     */
    @Test
    public void testSetOptD() {
        System.out.println("setOptD");
        String optD = "";
        Game instance = new Game();
        instance.setOptD(optD);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuestion method, of class Game.
     */
    @Test
    public void testSetQuestion() {
        System.out.println("setQuestion");
        String question = "";
        Game instance = new Game();
        instance.setQuestion(question);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnswer method, of class Game.
     */
    @Test
    public void testSetAnswer() {
        System.out.println("setAnswer");
        String answer = "";
        Game instance = new Game();
        instance.setAnswer(answer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProgess method, of class Game.
     */
    @Test
    public void testSetProgess() {
        System.out.println("setProgess");
        int current = 0;
        int total = 0;
        Game instance = new Game();
        instance.setProgess(current, total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkAnswer method, of class Game.
     */
    @Test
    public void testCheckAnswer() {
        System.out.println("checkAnswer");
        String input = "";
        Game instance = new Game();
        boolean expResult = false;
        boolean result = instance.checkAnswer(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
