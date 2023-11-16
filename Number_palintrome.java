package sample;

import java.util.Scanner;

public class Number_palintrome {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		int newnumber=number;
		int rem,rev=0;
		while(number>0)
		{
			rem=number%10;
			rev=rev*10+rem;
			number=number/10;
			
		}
		if(newnumber==rev)
		{
			System.out.println(newnumber+" is a palintrome");
		}
		else
		{
			System.out.println(newnumber+" is not a palintrome");
		}
		
	}

}
