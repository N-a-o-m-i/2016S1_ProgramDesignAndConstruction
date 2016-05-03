package question2;


public class Rectangle extends Shape
{
    double w;
    double h;
    
    public Rectangle(double w, double h) {
        super("Rectangle");
        this.w = w;
        this.h = h;
        calculateArea();
    }
    
    public Rectangle(double side)
    {
        super("suqare");
        this.w = w;
        this.h = h;
        calculateArea();
    }
   
    @Override
    public void calculateArea() {
        this.area = w * h;
    }

}