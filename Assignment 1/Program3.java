/*
Accept two integers from the user and perform addition, subtraction, multiplication, division, and modulus. Display results for each operation.  
*/
import java.util.*;
public class Program3
{
	public static void main(String args[])
	{
        	Scanner in = new Scanner(System.in);
        	System.out.print("Enter first integer: ");
        	int a = in.nextInt();
        	System.out.print("Enter second integer: ");
                int b = in.nextInt();
        	System.out.println("Addition: " + (a + b));
        	System.out.println("Subtraction: " + (a - b));
        	System.out.println("Multiplication: " + (a * b));
        	System.out.println("Division: " + (a / b));
        	System.out.println("Modulus: " + (a % b));
    	}
}