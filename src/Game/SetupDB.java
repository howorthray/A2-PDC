package Game;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SetupDB {

    DBManager dbManager;
    Connection conn;
    Statement statement;

    public SetupDB() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();
        try {
            statement = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        addTables();
    }
    
    public void addTables(){
         try {
            if(!checkTableExists("USERS")){
                this.statement.executeUpdate("CREATE  TABLE USERS  (USERNAME   VARCHAR(50),   PASSWORD   VARCHAR(20),   BALANCE   INT)");
            }
            if(!checkTableExists("QUESTIONS")){
                this.statement.executeUpdate("CREATE  TABLE QUESTIONS  (QUESTION_ID   INT,   QUESTION   VARCHAR(255),   OPT_A   VARCHAR(50), OPT_B   VARCHAR(50), OPT_C  VARCHAR(50), OPT_D   VARCHAR(50), ANSWER  VARCHAR(50))");
            }
            this.statement.addBatch("INSERT INTO USERS VALUES ('Ray', '2212', 0)");
            this.statement.addBatch("INSERT INTO QUESTIONS VALUES (1, 'A', 'B', 'C', 'D', 'E', 'E')");
            this.statement.executeBatch();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        this.closeConnection();
    }

    public void closeConnection() {
        this.dbManager.closeConnections();
    }
    
    public boolean checkTableExists(String tableName) {
        boolean exists = false;
        try {
            DatabaseMetaData dbmd = this.conn.getMetaData();
            String[] types = {"TABLE"};
            Statement statement;
            statement = this.conn.createStatement();
            ResultSet rs = dbmd.getTables(null, null, null, types);

            while (rs.next()) {
                String table_name = rs.getString("TABLE_NAME");
                System.out.println(table_name);
                if (table_name.equalsIgnoreCase(tableName)) {
                    exists = true;
                }
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return exists;
    }

}
