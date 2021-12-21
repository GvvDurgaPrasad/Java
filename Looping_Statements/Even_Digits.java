package Looping_Statements;
import java.util.*;

public class Even_Digits 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num :");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
		}
		

	}

}
