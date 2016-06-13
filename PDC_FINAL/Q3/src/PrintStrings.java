/**
 *
 * @author Naomi
 */
public class PrintStrings
{
  public static void main(String args[])
  {
    String aString = "Hi";
    ResultString rs1 = new ResultString("Hello");
    changeData(rs1, aString);
    System.out.println("Line 4: " + aString);
    System.out.println("Line 5: " + rs1.str);
  }

  public static void changeData(ResultString result, String aStr)
  {
    ResultString rs2 = new ResultString("Good Day");
    aStr = aStr + ", Tom";
    result.str = result.str + ", Alice";

    System.out.println("Line 1: " + result.str);

    result = rs2;
    result.str = result.str + ", Bob.";
    rs2.str = rs2.str + " It's a nice day";

    System.out.println("Line 2: " + rs2.str);
    System.out.println("Line 3: " + result.str);
  }
}
