package Nested_Loops;
import java.util.*;
import java.util.Scanner.*;

public class Right_Tri_Num 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num :");
		int num = sc.nextInt();
		
		for(int row=1; row<=num; row++)
		{
			for(int space=1; space<=num-row; space++)
			{
				System.out.print(" ");
			}
			for(int col=1; col<=row; col++)
			{
				System.out.print("*");
			}
			System.out.println();
	}		



	}

}
