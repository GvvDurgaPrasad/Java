package Looping_Statements;
import java.util.*;

public class Do_While_Demo
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s;
		do 
		{	
			
		
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Large");
		break;
		case 2:System.out.println("Medium");
		break;
		case 3:System.out.println("Small");
		break;
		default:System.out.println("no ans Match");
		}
		
	
		System.out.println("You want to continue");
		s=sc.next();
		}
		while(s.equals("yes"));

	}

}


