/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game;

/**
 *
 * @author elanm
 */
public class LevelOne implements GameMode{

    public String name;
    public int buyIn;
    public int numQuestions;
    public int reward;
    
    public LevelOne(){
        this.name = "Level 1";
        this.buyIn = 0;
        this.numQuestions = 100;
        this.reward = 100;
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
