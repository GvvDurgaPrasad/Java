package Statements;
import java.util.*;

public class Monthly_Salary 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the monthly salary :");
		double sal = sc.nextLong();
		System.out.println("Enter the HRA amount :");
		double hra = sc.nextDouble();
		System.out.println("Enter the PF amount :");
		double pf = sc.nextDouble();
		double annualSalary = sal*12;
		System.out.println("annualSalary :" +annualSalary);
		double tax,deductions;
		deductions = hra+pf;
		tax = annualSalary-deductions;
		System.out.println("tax :" +tax);
		double totalTax=0;
		
		if(tax<=500000)
		{
			totalTax = tax*(10/100);
		}
		else if(tax>500000 && tax<=1000000)
		{
			totalTax = tax*(20/100);
		}
		else if(tax>1000000)
		{
			totalTax = tax*(30/100);
			
		}
		System.out.println("totalTax :" +totalTax);
		
		
		
		
	}

}
