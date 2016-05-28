package bookstore;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookStore
{

    Connection conn=null;
    //String url="jdbc:derby:BookStoreDB;create=true";  
    String url = "jdbc:derby://localhost:1527/BookStroeDB"; //url of the DB host
    String username="PDC";  //your DB username
    String password="PDC";   //your DB password
    Statement statement;
    ResultSet rs;
    
    public void autoConnectBookStoreDB()
    {
        try
        {
            conn = DriverManager.getConnection(url, username, password);
            statement = conn.createStatement();
            checkTableExisting("BOOK");
            statement.executeUpdate("CREATE TABLE BOOK (BOOKID INT, TITLE VARCHAR(50), CATEGORY VARCHAR(20), PRICE FLOAT"); //Create BOOK table
            statement.executeUpdate("INSERT INTO BOOK VALUES (1,'Slum Dog Millionaire','Fiction',19.90)," //Insert Values into BOOK table
                                + "(2,'Run Mummy Run','Fiction',28.00),"
                                + "(3,'The Land of Painted Caves','Fiction',15.40),"
                                + "(4,'Cook with Jamie','Non-fiction',55.20),"
                                + "(5,'Far Eastern Odyssey','Non-fiction',24.90),"
                                + "(6,'Open','Non-fiction',33.60),"
                                + "(7,'Big Java', 'Textbook',55.00),"
                                + "(8,'Financial Accounting','Textbook',24.80);");
            
        }
        catch(Throwable e)
        {
            System.err.println("SQL Exception: " + e.getMessage());
        } 
    }


    public void createPromotionTable()
    {
     /* You may need the following SQL statements for this method:

      * Create the table:
        CREATE TABLE PROMOTION (CATEGORY VARCHAR(20), DISCOUNT INT);

      * Insert records into the table: 
        INSERT INTO PROMOTION VALUES ('Fiction', 0),
        ('Non-fiction', 10),
        ('Textbook', 20);

      */

    }

    public ResultSet getWeekSpecial()
    {
     /* You may need the following SQL statements for this method:

      * Query multiple tables:
        
          SELECT TITLE, PRICE, DISCOUNT FROM BOOK, PROMOTION WHERE BOOK.CATEGORY=PROMOTION.CATEGORY;

      */


        ResultSet rs=null;


        return(rs);

    }

    public void createWeekSpecialTable(ResultSet rs)
    {
        try {
            
            
            
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(BookStore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void checkTableExisting(String newTableName)
    {
        try
        {
            System.out.println("check existing tables...");
            String[] types = {"TABLE"};
            DatabaseMetaData dbmd = conn.getMetaData();
            ResultSet rsDBMeta = dbmd.getTables(null, null, null, null); //types
            Statement dropStatement = null;
            
            while(rsDBMeta.next())
            {
                String tableName = rsDBMeta.getString("TABLE_NAME");
                System.out.println("found: " + tableName);
                if(tableName.compareToIgnoreCase(newTableName) == 0)
                {
                    System.out.println(tableName + " needs to be deleted");
                    String sqlDropTable = "DROP TABLE " + newTableName;
                    dropStatement = conn.createStatement();
                    dropStatement.executeUpdate(sqlDropTable);
                    System.out.println("stable deleted");
                }
                
                
            }
            
        }
        catch()
        {
        }
    }


}
