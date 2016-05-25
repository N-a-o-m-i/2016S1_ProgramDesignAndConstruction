package mathquiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Naomi
 */
public class QuizMain 
{
    private HashMap<String, User> users;
    private final String fileName;
    
    public QuizMain()
    {
        this.fileName = "user.txt";
        this.users = new HashMap();
        this.getUsers(fileName);
    }
    
    public static void main(String[] args)
    {
        
    }
    
    public void getUsers(String fn) 
    {
        FileInputStream fIn;
        try
        {
            fIn = new FileInputStream(fn);
            Scanner fileScanner = new Scanner(fIn);
            
            while(fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                StringTokenizer st = new StringTokenizer(line);
                User u = new User(st.nextToken(), Integer.parseInt(st.nextToken()));
                this.users.put(u.userName, u);
            }
            fIn.close();
        }
        catch(FileNotFoundException e)
        {
            Logger.getLogger(QuizMain.class.getName()).log(Level.SEVERE, null, e);
        }
        catch(IOException e)
        {
            Logger.getLogger(QuizMain.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
