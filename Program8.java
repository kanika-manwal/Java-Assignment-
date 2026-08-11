/*
Write a program that: 
• Reads marks of 5 students into an integer array. 
• Prints each student’s marks.
*/
import java.util.*;
public class Program8
{
	public static void main(String args[])
	{
        	Scanner in = new Scanner(System.in);
        	int[] marks = new int[5];
        	for (int i = 0; i < 5; i++)
		{
            		System.out.print("Enter marks of student " + (i + 1) + ": ");
            		marks[i] = in.nextInt();
        	}
        	System.out.println("Student Marks:");
        	for (int i = 0; i < 5; i++)
		{
            		System.out.println("Student " + (i + 1) + ": " + marks[i]);
        	}
    	}
}