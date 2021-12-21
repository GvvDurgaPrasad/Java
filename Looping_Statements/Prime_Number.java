package Looping_Statements;
import java.util.*;

public class Prime_Number 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num :");
		int num = sc.nextInt();
		int count=0;
		
		for(int i=2; i<=num/2; i++)
		{
			if(num % i ==0)
			{
				count++;
				
			}
			
		}
		if(count == 0 && num != 1)
		{
			System.out.println("prime Number");
		}
		else
		{
			System.out.println("Not a prime Number");
		}

	}

}
