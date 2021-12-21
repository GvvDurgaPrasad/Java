package Statements;

import java.util.Scanner;

public class Selling_Price 
{

	public static void main(String[] args) 
	{
		
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the itemprice");
				double itemprice=sc.nextDouble();
				double sellingprice=0.0;
				double discount=0.0;
				if(itemprice>0 && itemprice<=10000)
				{
					discount=itemprice*10/100;
				}
				else if(itemprice>10000 && itemprice<=20000)
				{
					discount=itemprice*20/100;
				}
				else if(itemprice>20000)
				{
					discount=itemprice*25/100;
				}
				System.out.println("The Discount is :"+discount);
				sellingprice=itemprice-discount;
				System.out.println("The Selling price is :"+sellingprice);

			}

		}


