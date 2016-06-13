public class MyCount
{
  private int num1 = 0;
  private static int num2 = 0;

  public static void main(String args[])
  {
    MyCount mc1 = new MyCount();
    MyCount mc2 = new MyCount();

    mc1.num1++;
    mc1.num2++;
    mc2.num1++;
    mc2.num2++;

    System.out.println("mc1: " + mc1.num1 + ", " + mc1.num2);
    System.out.println("mc2: " + mc2.num1 + ", " + mc2.num2);
  }

}
