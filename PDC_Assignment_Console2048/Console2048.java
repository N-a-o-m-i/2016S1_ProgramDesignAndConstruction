package main;

import java.util.Random;
import java.util.Scanner;

public class Console2048 
{
    public static void main(String[] args)
    {
        int[][] nums = new int[4][4];
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        final String UP = "u";
        final String DOWN = "d";
        final String LEFT = "l";
        final String RIGHT = "r";
        
        String direction;
        boolean gameOverFlag;
        
        int location1 = r.nextInt(16);
        int location2 = r.nextInt(16);
        
        while(location1 == location2)
        {
            location2 = r.nextInt(16);
        }
        
        nums[location1/4][location1%4] = (r.nextInt(2) + 1) * 2;
        nums[location2/4][location2%4] = (r.nextInt(2) + 1) * 2;
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
}
