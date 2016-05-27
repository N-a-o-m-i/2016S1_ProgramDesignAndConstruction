package bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookStore {

    Connection conn=null;
    String url="";  //url of the DB host
    String username="";  //your DB username
    String password="";   //your DB password

    public void connectBookStoreDB()
    {
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



}
