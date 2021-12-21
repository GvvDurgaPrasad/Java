package Looping_Statements;
import java.util.*;

public class Factor_Digits 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		int factor = 1;
		
		while(factor<=num)
		{
			if(num%factor == 0)
			{
				System.out.println(factor);
			}
				factor++;
		}
	}

}
