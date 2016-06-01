package model;

import java.awt.Point;

public class Cell 
{
    private static final int CELL_WIDTH = 120;
    
    private int value;
    
    private Point cellLocation;
    
    public Cell(int value)
    {
        setValue(value);
    }
    
    public static int getCellWidth()
    {
        return CELL_WIDTH;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public int setValue(int value)
    {
        return value;
    }
    
    public boolean isZeroValue()
    {
        return (value == 0);
    }
    
    public void setCellLocation(int x, int y)
    {
        setCellLocation(new Point(x, y));
    }
    
    public void setCellLocation(Point cellLocation)
    {
        this.cellLocation = cellLocation;
    }
    
    
    
    
    
}
