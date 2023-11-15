package sample;

import java.util.Scanner;

public class Display_digits {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	int rem;
	System.out.println("The digits are");
	while(num>0)
	{
		rem=num%10;
		System.out.print(rem+", ");
		num=num/10;
	}
}
}
