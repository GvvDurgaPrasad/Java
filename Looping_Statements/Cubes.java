package Looping_Statements;
import java.util.*;

public class Cubes 
{

	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int i=1;
		while(i<=num)
		{
			System.out.println("number is :"+i+" and cube of "+i+" is : "+(i*i*i));
			i++;
		}
		

	}

}
