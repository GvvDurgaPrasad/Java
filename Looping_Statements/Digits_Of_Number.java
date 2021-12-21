package Looping_Statements;
import java.util.*;

public class Digits_Of_Number 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		int digit=0;
		while(num!=0)
		{
			digit=num%10;
			System.out.println(digit);
			num=num/10;
		}

	}

}