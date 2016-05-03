package question2;


public class Circle extends Shape{
    double radius=0;
    public Circle(double r){
        super("Circle");
        this.radius=r;
        calculateArea();
    }

    public void calculateArea(){
    
        this.area=radius*radius*3.14;
    }
    
    public void printSth(){
    
        System.out.println("Hello");
    }
}
