package mathquiz;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Naomi
 */
public class Game 
{
    private HashSet<QuizQuestion> questions;
    private User aUser;
    
    public Game(User u)
    {
        this.questions = new HashSet();
        this.aUser = u;
        this.doQuestions();
    }
    
    public void doQuestions()
    {
        String answer;
        Scanner sc = new Scanner(System.in);
        
        //Generate questions(no more than three questions)
        while(this.questions.size() < 3)
        {
            this.questions.add(new QuizQuestion());
        }
        System.out.println("Enter your answer as a number. Press 'X' to quit.");
        
        //Ask questions, check the answers and calculate the scores
        for(QuizQuestion question : this.questions)
        {
            System.out.println(question.num1 + " " + question.mathOp + " " + question.num2 + "=?");
            do
            {
                answer = sc.nextLine();
            }
            while(!this.isValidAnswer(answer));
            
            if(answer.equalsIgnoreCase("x"))
                break;
            
            if(Math.abs(Double.parseDouble(answer) - question.answer) <= 0.01)
            {
                this.aUser.score += 10;
                System.out.println("Correct!");
            }
            else
            {
                this.aUser.score -= 10;
                System.out.println("Wrong!");
            }
        }
    }
    
    public boolean isValidAnswer(String answer)
    {
        try
        {
            Double.parseDouble(answer);
        }
        catch(Exception e)
        {
            if(answer.equalsIgnoreCase("x"))
                return true;
            System.out.println("Invalid Input. Please enter your answer again: ");
            return false;
        }
        return true;
    }
}
