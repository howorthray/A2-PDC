package Game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBManager {
    
    //Main manager class for connecting to the database

    private final String USER_NAME = "pdc";
    private final String PASSWORD = "pdc";
    private final String URL = "jdbc:derby:QuizGameDB_Edb; create=true";

    Connection conn;

    public DBManager() {
        establishConnection();
    }

    
    public Connection getConnection() {
        return this.conn;
    }

    //Establish connection
    public void establishConnection() {
        if (this.conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    //Closes the connections
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
