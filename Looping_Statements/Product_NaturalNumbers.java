package Looping_Statements;
import java.util.*;

public class Product_NaturalNumbers
{

	public static void main(String[] args) 
	{
				Scanner sc =  new Scanner(System.in);
				System.out.println("Enter the number :");
				int num = sc.nextInt();
				int i=1;
				int range = 10;
				while(i<=range)
				{
					System.out.println(num+"*"+i+"=" +(num*i));
					i++;
				}
				

	}	

}

