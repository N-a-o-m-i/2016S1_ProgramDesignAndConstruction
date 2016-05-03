package question1;

/**
 *This is the example of Mid-exam
 * This is the first question of three
 * Almost done
 * Except one thing: 
 *                  when enter invalid values several times
 *                  then enter the valid value, but nothing happened after
 *                  unless type the correct value again
 */

import java.util.Scanner;

/**
 *
 * @author Naomi
 */
public class Numbers {
        
    public static void main(String[] args)
    {
        int positiveInteger = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer: ");
        
        while(true)
        {
            try 
            {
                positiveInteger = scanner.nextInt();  
                if(positiveInteger <= 0)
                {
                    System.out.println("Input is a negative Integer. ");
                    System.out.println("Please enter a positive integer: ");
                    positiveInteger = scanner.nextInt();
                }
                else
                {
                    break;
                }
            } 
            catch (Exception e) 
            {
                System.out.println("Invalid value, please type again: ");
                scanner.next();
                continue;
            }
        } 
        
        if(positiveInteger >= 3)
        {
            System.out.println("All the positive odd numbers which are smaller than the input: ");
            for(int i = 1; i < positiveInteger; i+=2)
            {
                System.out.print(i + ", ");
            }
            System.out.println("\nThe sum of all the even numbers which are smaller than the input: ");
            int evenSum = 0;
            for(int i = 2; i < positiveInteger; i+=2)
            {
                evenSum += i;
            }
            System.out.print(evenSum);
        }else if(positiveInteger == 1)
        {
            System.out.println("no odd and even number found.");
        }else
        {
            System.out.println("no even number found.");
        }
    }
    
    
    
}
