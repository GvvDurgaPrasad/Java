package Var_Dat;

import java.util.*;

public class BMI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight :");
		double weight = sc.nextDouble();
		System.out.println("Enter the height  :");
		double height = sc.nextDouble();
		double BMI = weight/(height*height);
		System.out.println("The BMI is :" +BMI);
		
		
	}

}
