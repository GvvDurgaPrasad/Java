package Var_Dat;

import java.util.*;

public class Fah_Cel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Fahrenheit :");
		float Fahrenheit = sc.nextFloat();
		float celsius = ((Fahrenheit-32)*5)/9;
		System.out.println("The celsius :" +celsius);
		

	}

}
