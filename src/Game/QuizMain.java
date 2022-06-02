package Game;

public class QuizMain {
    
    //Main class for starting the game
    public static void main(String[] args) {
        //Sets up/connects to database
        SetupDB database = new SetupDB();
        //Populates questions
        Questions questions = new Questions();
        //Opens menu
        Menu m = new Menu();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }    
}
