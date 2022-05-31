package Game;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class ScriptHelper {
    
    DBManager database;
    Connection conn;
    Statement statement;
    
    public ScriptHelper(){
        database = new DBManager();
        conn = database.getConnection();
    }
    
    public Connection getConnection(){
        return this.conn;
    }
    
    public void executeScript(String input){
        try{
            statement = this.conn.createStatement();
            statement.executeUpdate(input);

        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public ResultSet executeQuery(String input){
        ResultSet rs = null;
        try{
            rs = this.statement.executeQuery(input);
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return rs;
    }
    
    
    public void closeConnection() {
        this.database.closeConnections();
    }
    
    public boolean checkTableExists(String tableName) {
        boolean exists = false;
        try {
            DatabaseMetaData dbmd = this.conn.getMetaData();
            String[] types = {"TABLE"};
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
