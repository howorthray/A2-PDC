package Game;

import java.util.Random;

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
        this.buyIn = 100000;
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
    
    @Override
    public Integer[] getQuestionId() {
        Random rand = new Random();
        Integer[] numArray = new Integer[this.numQuestions];
        for (int i = 0; i < numArray.length; i++) {
            boolean run = true;
            while (run) {
                run = false;
                int x = rand.nextInt(75) + 1;
                for (int j = 0; j < i; j++) {
                    if (x == numArray[j]) {
                        run = true;
                        break;
                    }
                }
                if (!run) {
                    numArray[i] = x;
                }
            }
        }
        return numArray;
    }
    
}
