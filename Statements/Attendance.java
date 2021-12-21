package Statements;
import java.util.*;

public class Attendance 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("number of classes held :");
		int x = sc.nextInt();
		System.out.println("number of classes attended :");
		int y = sc.nextInt();
		float percentage;
		percentage=((y*100)/x);
		System.out.println(percentage);
		if(percentage>=75)
		{
			System.out.println("Allowed to exam");
		}
		else
		{
			System.out.println("not allowed to exam");
		}
		
		
	}

}
