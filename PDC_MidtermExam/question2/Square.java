package question2;


public class Square extends Rectangle
{
    double side;
    
    
    public Square(double side) {
        super(side,side);
        this.setName("Suqare");
        this.side = side;
        calculateArea();
    }
    
    @Override
    public void calculateArea() {
        this.area = this.side * this.side;
    }
}
