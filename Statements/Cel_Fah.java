package Statements;

import java.util.*;

public class Cel_Fah 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("choose 1 for fah to cel");
		System.out.println("choose 2 for cel to fah");
		int n = sc.nextInt();
		
		switch(n)
		{
			case 1: 
				System.out.println("Enter the Fahrenheit :");
				double Fahrenheit = sc.nextDouble();
				double celsius = ((Fahrenheit-32)*5)/9;
				System.out.println("The celsius :" +celsius);
				break;
			
			case 2:
				System.out.println("Enter the celsius :");
				celsius = sc.nextDouble();
				Fahrenheit = (9.0/5.0)*celsius+32;
				System.out.println("The Fahrenheit :" +Fahrenheit);
				break;
		}

	}

}
