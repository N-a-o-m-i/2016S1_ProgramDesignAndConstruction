package model;

import java.util.Random;

public class Game2048Model 
{
    
    private static final int GRID_WIDTH = 4;
    
    private int highScore;
    private int highCell;
    private int currentScore;
    private int currentCell;
    
    private Cell[][] grid;
    
    private Random random;
    
    public Game2048Model()
    {
        
        this.highScore = 0;
        this.highCell = 0;
        this.currentScore = 0;
        this.currentCell = 0;
        
        this.random = new Random();
    }
    
    public void setHighScores()
    {
        highScore = (currentScore > highScore) ? currentScore : highScore;
        highCell = (currentCell > highCell) ? currentCell : highCell;
        currentScore = 0;
        currentCell = 0;
    }
    
    public boolean isGameOver()
    {
        return isGridFull() && isMovable();
    }
    
    public boolean isGridFull()
    {
        for(int x = 0; x < GRID_WIDTH; x++)
        {
            for(int y = 0; y < GRID_WIDTH; y++)
            {
                if(grid[x][y].isZeroValue())
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isMovable()
    {
        for(int x = 0; x < GRID_WIDTH; x++)
        {
            for(int y = 0; y < GRID_WIDTH; y++)
            {
                int yy = y + 1;
                if(grid[x][y].getValue() == grid[x][yy].getValue())
                {
                    return true;
                }
            } 
        }
        
        for(int y = 0; y < GRID_WIDTH; y++)
        {
            for(int x = 0; x < GRID_WIDTH; x++)
            {
                int xx = x + 1;
                if(grid[x][y].getValue() == grid[xx][y].getValue())
                {
                    return true;
                }
            } 
        }
        
        return false;
    }
    
    public void addNewCell()
    {
        int value = (random.nextInt(10) < 9)? 2 : 4;
        
        boolean locationFound = false;
        while(!locationFound)
        {
            int x = random.nextInt(GRID_WIDTH);
            int y = random.nextInt(GRID_WIDTH);
            
            if(grid[x][y].isZeroValue())
            {
                grid[x][y].setValue(value);
                locationFound = true;
            }
        }
        
        updateScore(0, value);
    }
    
    
    
    
    
    
    
    private boolean combineCells(int x1, int y1, int x2, int y2, boolean isCombined)
    {
        if(!grid[x1][y1].isZeroValue())
        {
            int value = grid[x1][y1].getValue();
            if(grid[x2][y2].getValue() == value)
            {
                int newValue = value + value;
                grid[x2][y2].setValue(newValue);
                grid[x1][y1].setValue(0);
                updateScore(newValue, newValue);
                isCombined = true;
            }
        }
        return isCombined;
    }
    
    
    
    private void updateScore(int value, int cellValue)
    {
        currentScore += value;
        currentCell = (cellValue > currentCell) ? cellValue : currentCell;
    }
    
    public Cell getCell(int x, int y)
    {
        return grid[x][y];
    }
    
    public int getHighScore()
    {
        return this.highScore;
    }
    
    public int getHighCell()
    {
        return this.highCell;
    }
    
    public void setHighScore(int highScore)
    {
        this.highScore = highScore;
    }
    
    public void setHighCell(int highCell)
    {
        this.highCell = highCell;
    }
    
    public int getCurrentScore()
    {
        return this.currentScore;
    }
    
    public int getCurrentCell()
    {
        return this.currentCell;
    }
    
    
    
    
    
    
    
        
}
