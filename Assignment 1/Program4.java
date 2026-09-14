/*
Write a program to check if a person is eligible to vote. 
• Input: age and citizenship status (true or false). 
• Use logical operators (&&, ||) to decide eligibility.
*/
import java.util.*;
public class Program4
{
	public static void main(String args[])
	{
        	Scanner in = new Scanner(System.in);
        	System.out.print("Enter age: ");
        	int age = in.nextInt();
        	System.out.println("Are you a citizen? (true/false): ");
        	boolean citizen = in.nextBoolean();
        	if (age >= 18 && citizen == true)
		{
            		System.out.println("Eligible");
        	}
		else
		{
            		System.out.println("Not eligible");
        	}
    	}
}