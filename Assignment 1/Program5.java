/*
Write a program that: 
• Takes two numbers and an operator symbol (+, -, *, /) from the user. 
• Uses if-else statements to perform the appropriate operation. 
*/
import java.util.*;
public class Program5
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
        	System.out.println("Enter first number: ");
        	double a = in.nextDouble();
        	System.out.println("Enter second number: ");
        	double b = in.nextDouble();
        	System.out.println("Enter operator (+, -, *, /): ");
        	char operator = in.next().charAt(0);
        	if (operator == '+')
		{
            		System.out.println("Result: " + (a + b));
        	} 
        	else if (operator == '-') 
		{
            		System.out.println("Result: " + (a - b));
        	} 
        	else if (operator == '*') 
		{
            		System.out.println("Result: " + (a * b));
        	} 
        	else if (operator == '/') 
		{
            		System.out.println("Result: " + (a / b));
        	} 
        	else 
		{
            		System.out.println("Invalid operator");
       		 }
    }
}