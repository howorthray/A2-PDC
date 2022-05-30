package Game;

/**
 *
 * @author elanm
 */
public class LevelThree implements GameMode{

   public String name;
    public int buyIn;
    public int numQuestions;
    public int reward;
    
    public LevelThree(){
        this.name = "Level 3";
        this.buyIn = 30000;
        this.numQuestions = 5;
        this.reward = 100000;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getBuyIn() {
        return this.buyIn;
    }

    @Override
    public int numQuestions() {
        return this.numQuestions;
    }

    @Override
    public int getReward() {
        return this.reward;
    }
    
}
