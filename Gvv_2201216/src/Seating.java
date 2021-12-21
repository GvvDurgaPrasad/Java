import java.util.Scanner;

public class Seating {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1 || n%4==1 || n%4==2)
		{
			System.out.println("Window");
		}
		else 
		{
			System.out.println("Aisle");
		}
		

	}

}
