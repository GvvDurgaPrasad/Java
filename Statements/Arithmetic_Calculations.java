package Statements;
import java.util.*;
public class Arithmetic_Calculations 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2");
		int num2 = sc.nextInt();
		System.out.println("choose 1 for add");
		System.out.println("choose 2 for sub");
		System.out.println("choose 3 for mul");
		System.out.println("choose 4 for div");
		int n = sc.nextInt();
		
		switch(n)
		{
			case 1:
				int add;
				add = num1 + num2;
				System.out.println("add :" +add);
				break;
			case 2:
				int sub;
				sub = num1 - num2;
				System.out.println("sub :" +sub);
				break;
			case 3:
				int mul;
				mul = num1 * num2;
				System.out.println("mul :" +mul);
				break;
			case 4:
				int div;
				div = num1 / num2;
				System.out.println("div :" +div);
				break;
			
		}
		
		

	}

}
