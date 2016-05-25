package mathquiz;

/**
 *
 * @author Naomi
 */
public class User 
{
    public String userName = null;
//    public String password = null;
    public int score = 0;
    
    public User(String userName, int score)
    {
        this.score = score;
        this.userName = userName;
    }
    
}
