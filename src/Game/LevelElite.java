package Game;

/**
 *
 * @author elanm
 */
public class LevelElite implements GameMode{
    
    public String name;
    public int buyIn;
    public int numQuestions;
    public int reward;
    
    public LevelElite(){
        this.name = "Elite";
        this.buyIn = 10000;
        this.numQuestions = 10;
        this.reward = 1000000;
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
