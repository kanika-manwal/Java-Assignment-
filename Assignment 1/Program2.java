/*
Write a Java program that: 
• Stores an integer value for temperature in Celsius. 
• Converts it to Fahrenheit using the formula F = (C × 9/5) + 32. 
• Displays both Celsius and Fahrenheit values. 
*/
public class Program2
{
	public static void main(String args[])
	{
		int celsius = 18;
        	double fahrenheit = (celsius * 9.0 / 5) + 32;
        	System.out.println("Celsius: " + celsius);
        	System.out.println("Fahrenheit: " + fahrenheit);
    	}
}