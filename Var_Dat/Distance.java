package Var_Dat;

import java.util.*;

public class Distance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float time,mps,mph,kph;
		System.out.println("Enter the distance in meters : ");
		float distance = sc.nextFloat();
		
		System.out.println("Hours :");
		float hours = sc.nextFloat();
		
		System.out.println("Minutes :");
		float minutes = sc.nextFloat();
		
		System.out.println("Seconds :");
		float seconds = sc.nextFloat();
		
		time = (hours*3600)+(minutes*60)+seconds;
		mps = distance/time;
		kph = (distance/1000)/(time/3600);
		mph = kph/1609;
		
		System.out.println("your speed in mps :" +mps);
		System.out.println("your speed in kph :" +kph);
		System.out.println("your speed in mph :" +mph);
				
		
		

	}

}
