package Var_Dat;

import java.util.*;

public class SwappingNumbers {

	public static void main(String[] args) {
		
		int x,y,t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x and y values :");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Before Swapping:" +x +" " +y);
		t = x;
		x = y;
		y = t;
		System.out.println("After Swapping:" +x +" " +y);
		

	}

}
