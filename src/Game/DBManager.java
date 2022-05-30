package Game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBManager {
    
    //Main manager class for connecting to the database
    //hghuvhfhdub

    private final String USER_NAME = "pdc";
    private final String PASSWORD = "pdc";
    private final String URL = "jdbc:derby:QuizGameDB_Edb; create=true";

    Connection conn;

    public DBManager() {
        establishConnection();
    }

    public static void main(String[] args) {
        DBManager dbManager = new DBManager();
        System.out.println(dbManager.getConnection());
//        Database db = new Database();
//        System.out.println(db.getConnection());
    }

    public Connection getConnection() {
        return this.conn;
    }

    //Establish connection
    public void establishConnection() {
        if (this.conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                System.out.println(URL + " Connected Successfully ....");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    public void closeConnections() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}
