package mathquiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
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
        Game aGame;
        QuizMain qm = new QuizMain();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String s = scanner.nextLine();
        User u = qm.checkUser(s);
        aGame = new Game(u);
        qm.updateScore(u);
        System.out.println(u.userName + ", your score is: " + u.score);
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
    
    public User checkUser(String un)
    {
        User u;
        if(this.users.containsKey(un))
        {
            u = this.users.get(un);
            System.out.println("Your current score: " + u.score);
        }
        else
        {
            u = new User(un, 0);
            this.users.put(un, u);
        }        
        return u;
    }
    
    public void updateScore(User user)
    {
        this.users.put(user.userName, user);
        try
        {
            FileOutputStream fOut = new FileOutputStream(this.fileName);
            PrintWriter pw = new PrintWriter(fOut);
            for(User u : this.users.values())
            {
                pw.println(u.userName + " " + u.score);
            }
            pw.close();
        }
        catch(FileNotFoundException e)
        {
            Logger.getLogger(QuizMain.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
