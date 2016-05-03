package question2;


import java.util.Scanner;

public class Q2Main{
    public static void main(String[] args){
	
	Shape[] shapeArray = {new Circle(2.0), new Rectangle(2,5), new Square(2.0)};
        
        for(Shape s: shapeArray)
            s.printInfo();
        
    }
}