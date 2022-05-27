package Game;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Users {

    DBManager dbManager;
    Connection conn;
    Statement statement;

    public Users() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();
        try {
            statement = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void main(String[] args) {
        Users sbs = new Users();

        try {
            sbs.statement.addBatch("CREATE  TABLE USERS  (USERID  INT,   USERNAME   VARCHAR(50),   PASSWORD   VARCHAR(20),   BALANCE   INT)");
            sbs.statement.addBatch("INSERT INTO USERS VALUES (1, 'Ray', '2212', 0)");
            sbs.statement.executeBatch();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        sbs.closeConnection();
    }

    public void closeConnection() {
        this.dbManager.closeConnections();
    }

}
