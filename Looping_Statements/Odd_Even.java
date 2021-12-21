package Looping_Statements;
import java.util.*;

public class Odd_Even 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num :");
		int num = sc.nextInt();
		if(num % 2 == 0)
		{
			System.out.println("Number is even.");
		}
		else
		{
			System.out.println("Number is odd.");
		}
		
	}

}
