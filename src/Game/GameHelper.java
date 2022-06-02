package Game;

//Lets the Game class know how many questions there are and how many have been answers
public class GameHelper {
    
    //Static class for keeping track of how many questions to ask and how many have been answered
    static int count = 0;
    static int numGames = 0;
    static GameMode gameMode;
    
    //increases count of questions answered
    static void increaseCounter(){
        count++;
    }
    
    //sets number of questions based on Game Mode
    static void setNumGames(int num){
        numGames = num;
    }
    
    //Static method for setting current Game Mode
    static void setGameMode(GameMode gm){
        gameMode = gm;
    }
    
    //resets question count back to 0
    static void resetCount(){
        count = 0;
    }
}
