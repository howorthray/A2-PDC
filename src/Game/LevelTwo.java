
package Game;

import java.util.ArrayList;
import java.util.Random;

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

//    @Override
//    public Integer[] getQuestionId() {
//        Random rand = new Random();
//        Integer[] numArray = new Integer[this.numQuestions];
//        for (int i = 0; i < numArray.length; i++) {
//            boolean run = true;
//            while (run) {
//                run = false;
//                int x = rand.nextInt(75) + 1;
//                for (int j = 0; j < i; j++) {
//                    if (x == numArray[j]) {
//                        run = true;
//                        break;
//                    }
//                }
//                if (!run) {
//                    numArray[i] = x;
//                }
//            }
//        }
//        return numArray;
//    }
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
