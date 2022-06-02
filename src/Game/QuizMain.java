package Game;

public class QuizMain {

    public static void main(String[] args) {
        SetupDB u = new SetupDB();
        Questions q = new Questions();
        Menu m = new Menu();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }    
}
