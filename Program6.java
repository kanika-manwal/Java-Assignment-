/*
Ask the user for a number and print its multiplication table from 1 to 10 using a for loop.
*/
import java.util.*;
public class Program6
{
	public static void main(String args[])
	{
        	Scanner in = new Scanner(System.in);
        	System.out.println("Enter a number: ");
        	int number = in.nextInt();
        	for (int i = 1; i <= 10; i++) 
		{
            		System.out.println(number + " * " + i + " = " + (number * i));
       		 }
    	}
}