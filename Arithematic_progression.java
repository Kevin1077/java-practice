package sample;

import java.util.Scanner;

public class Arithematic_progression {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms in AP:");
		int n=sc.nextInt();
		System.out.println("Enter the first term:");
		int a=sc.nextInt();
		System.out.println("Enter the common difference:");
		int d=sc.nextInt();
		System.out.println("The terms in AP are:");
		for(int i=1;i<=n;i++)
		{
			if(i<n) {
			System.out.print(a+", ");
			a=a+d;
			}
			else {
				System.out.print(a);
			}
			
		}
	}

}
