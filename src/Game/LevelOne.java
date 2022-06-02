package Game;

import java.util.ArrayList;
import java.util.Random;

public class LevelOne implements GameMode{

    public String name;
    public int buyIn;
    public int numQuestions;
    public int reward;
    
    public LevelOne(){
        this.name = "Level 1";
        this.buyIn = 0;
        this.numQuestions = 3;
        this.reward = 300;
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
    
     //Gets a random Number base on how many questions are in the data base, then adds them to a ArrayList that size is set to the predetermined 
    @Override
    public ArrayList getQuestionId() {
        Random rand = new Random();
        ArrayList list = new ArrayList();
        while(list.size() < this.numQuestions){
            
            int randId = rand.nextInt((75 - 1) + 1) + 1;
            
            if(!list.contains(randId)){
                list.add(randId);
            }
        }
        return list;
    }
}
