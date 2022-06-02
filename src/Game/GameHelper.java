package Game;

//Lets the Game class know how many questions there are and how many have been answers
public class GameHelper {
    
    static int count = 0;
    static int numGames = 0;
    static GameMode gameMode;
    
    static void increaseCounter(){
        count++;
    }
    
    static void setNumGames(int num){
        numGames = num;
    }
    
    static void setGameMode(GameMode gm){
        gameMode = gm;
    }
    
    static void resetCount(){
        count = 0;
    }
}
