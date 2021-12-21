package Statements;
import java.util.*;

public class Leap_Year 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any year :");
		int year = sc.nextInt();
		
		if(year % 4 == 0)
		{
			System.out.println("year" +year+ "is a leap year");
		}
		else
		{
			System.out.println("year" +year+ "is not a leap year");
		}
		

	}

}
