
package DB;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Naomi
 */
public class GameDB 
{
    Connection conn = null;
    String url = "jdbc:derby://localhost:1527/Game2048DB;create=true";
    String username = "Game";    
    String password = "Game";
    Statement statement;
    ResultSet rs;
    
    public void autoConnectBookStoreDB()
    {
        try
        {
            conn = DriverManager.getConnection(url, username, password);
            statement = conn.createStatement();
            checkTableExisting("GAME");
            statement.executeUpdate("CREATE TABLE GAME (HIGHCELL INT, HIGHSCORE INT)");
            
            
        }
        catch(Throwable e)
        {
            System.err.println("SQL Exception: " + e.getMessage());
        }
    }
    
    private void checkTableExisting(String newTableName)
    {
        try
        {
            System.out.println("check existing tables...");
            String[] types = {"TABLE"};
            DatabaseMetaData dbmd = conn.getMetaData();
            ResultSet rsDBMeta = dbmd.getTables(null, null, null, null);
            Statement dropStatement = null;
            
            while(rsDBMeta.next())
            {
                String tableName = rsDBMeta.getString("TABLE_NAME");
                System.out.println("found: " + tableName);
                if(tableName.compareToIgnoreCase(newTableName) == 0)
                {
                    System.out.println(tableName + "needs to be deleted");
                    String sqlDropTable = "DROP TABLE " + newTableName;
                    dropStatement = conn.createStatement();
                    dropStatement.executeUpdate(sqlDropTable);
                    System.out.println(newTableName + ": table deleted");
                }
            }
            if(rsDBMeta != null)
            {
                rsDBMeta.close();
            }
            if(dropStatement != null)
            {
                dropStatement.close();
            }
        }
        catch(SQLException e)
        {
        }
    }
}
