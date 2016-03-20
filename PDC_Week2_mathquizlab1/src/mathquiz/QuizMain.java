package mathquiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class QuizMain 
{
    
    private static double result;
    
    static 
    {
        result = 0;
    }
    
    public static void main(String[] args)
    {
        int score=0;
        int totalScore = 0;
        int rounds=3;
        double cAnswer;
        double uAnswer;
        
        for(int i=0; i<rounds; i++)
        {
            Scanner keyboard = new Scanner(System.in);
            QuizMain qm = new QuizMain();
            System.out.println("\n"+ "This is round " + (i+1));
            qm.generateQuestion();
            System.out.println("Please enter your answer: ");
            
            while(true)
            {
                try
                {
                    uAnswer = keyboard.nextDouble();
                    break;
                }
                catch(InputMismatchException e)
                {
                    System.out.println("Invalid value, please type again: ");                
                    keyboard.next();
                    continue;
                }
            }

            if(qm.checkAnswer(uAnswer, result) == true)
            {
                score = score + 10;
                System.out.println("Correct!!");
            }
            else
            {
                score = score - 10;
                System.out.println("Wrong!!");
            }
            
            System.out.println("You got: " + score + " point in round" + (i+1));
        }
        totalScore += score;
        System.out.println(rounds + " rounds scores are: " + totalScore );
        
    }  

    public void generateQuestion(){
        int i = generateNumber(100);
        int j = generateNumber(100);
        double correctResult = 0;
        int operator = (int)(Math.random()*4) + 1;
        char operation = '?';
        
        switch(operator)
        {
                case 1: operation = '+';
                        correctResult = i + j;
                        break;
                case 2: operation = '-';
                        correctResult = i - j;
                        break;
                case 3: operation = '*';
                        correctResult = i * j;
                        break;
                case 4: operation = '/';
                        correctResult = i/j;    
                        break;
                default: operation = '?';
        }           
        System.out.println("The question is: " + i + operation + j);
        
        result = correctResult;
    }
     
    public int generateNumber(int range) {
        Random rand = new Random();
        int rn = rand.nextInt(range);
        return rn;
    }

    public boolean checkAnswer(double uAnswer, double cAnswer){
        QuizMain cmCheck = new QuizMain();
        return uAnswer == cAnswer? true:false;
    }

}
