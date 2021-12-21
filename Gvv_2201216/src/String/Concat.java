package String;

import java.util.Scanner;

public class Concat {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("FirstName :");
		String Firstname = sc.next();
		System.out.println("LastName :");
		String Lastname = sc.next();
		String Fullname = Firstname.concat(Lastname);
		System.out.println("Fullname :"+Fullname);
	}

}
