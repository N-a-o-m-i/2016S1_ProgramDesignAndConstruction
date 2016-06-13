public class MyClass
{
  public String myString = "I like Cricket";
  public void MyClass()
  {
    myString = "I like Rugby";
  }

  public MyClass()
  {
    this.myString = "I like Soccer";
  }

  public static void main(String[] args)
  {
    MyClass mc = new MyClass();
    System.out.println(mc.myString);
  }
}
