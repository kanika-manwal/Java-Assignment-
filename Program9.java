/*
Write a program to read 10 integers into an array and find the maximum value using a loop.
*/
import java.util.*;
public class Program9
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
        	int[] numbers = new int[10];
        	for (int i = 0; i < 10; i++)
		{
            		System.out.print("Enter number " + (i + 1) + ": ");
            		numbers[i] = in.nextInt();
        	}
        	int maximum = numbers[0];
        	for (int i = 1; i < 10; i++)
		{
            		if (numbers[i] > maximum)
			{
                		maximum = numbers[i];
            		}
        	}

        	System.out.println("Maximum value: " + maximum);
    	}
}