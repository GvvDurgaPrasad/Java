package Statements;
import java.util.*;

public class Five_Digit 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		
		if(number>=10000 && number>=9999)
		{
			System.out.println("The number is five digit.");
		}
		else
		{
			System.out.println("The number is not five digit.");
		}
		
	}

}
