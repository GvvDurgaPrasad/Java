package Looping_Statements;
import java.util.*;
public class Odd_Digits 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num :");
		int num = sc.nextInt();
		int count=0;
		
		for(int i=1; i<=num; i++)
		{
			if(i%2 != 0)
			{
				System.out.println(i);
			}
		}

	}

}
