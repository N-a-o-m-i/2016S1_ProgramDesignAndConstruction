
package bookstore;

import java.sql.ResultSet;

public class BookStoreMain
{

    public static void main(String[] args) 
    {
        BookStore bookStore = new BookStore();
        bookStore.autoConnectBookStoreDB();
        bookStore.createPromotionTable();
        bookStore.getWeekSpecial();
        bookStore.createWeekSpecialTable();
    }

}
