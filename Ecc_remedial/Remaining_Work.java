package Ecc_remedial;

import java.util.Scanner;

public class Remaining_Work {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total Work :");
		int TW = sc.nextInt();
		System.out.println("Enter the person 1 force :");
		int f1 = sc.nextInt();
		System.out.println("Enter the person 1 distance :");
		int d1 = sc.nextInt();
		System.out.println("Enter the person 2 force :");
		int f2 = sc.nextInt();
		System.out.println("Enter the person 2 distance :");
		int d2 = sc.nextInt();
		
		System.out.println("Remaining work :" +getWork(f1, d1, f2, d2, TW));
		
	}
	
	public static int getWork(int f1, int d1, int f2, int d2, int TW) {
		
		int result = TW - (f1 * d1) - (f2 * d2);
		return result;
	}

}
