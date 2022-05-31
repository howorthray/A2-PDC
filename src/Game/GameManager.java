/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game;

/**
 *
 * @author elanm
 */
public class GameManager {
    
    GameMode game;
    ScriptHelper rs = new  ScriptHelper();
    int questionCount = 0;
    
    public GameManager(GameMode gm){
         game = gm;
         
    }
    
    public String getQuestion(){
        Integer[] idArray = game.getQuestionId();
        for(int i = 0; i < idArray.length; i++){
            int questionId = idArray[i];
        }
        return null;
    }
}
