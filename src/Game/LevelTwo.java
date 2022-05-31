
package Game;

/**
 *
 * @author elanm
 */
public class LevelTwo implements GameMode{

    public String name;
    public int buyIn;
    public int numQuestions;
    public int reward;
    
    public LevelTwo(){
        this.name = "Level 2";
        this.buyIn = 1000;
        this.numQuestions = 3;
        this.reward = 10000;
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
