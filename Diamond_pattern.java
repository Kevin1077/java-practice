package sample;

import java.util.Scanner;

public class Diamond_pattern {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows:");
	int row=sc.nextInt();
	
	for(int i=1;i<=row;i++) {
		for(int j=1;j<=row;j++) {
			if(j<=row-i) {
				System.out.print("  ");
			}
			else {
				System.out.print("* ");
			}
			
		}
		for(int j=1;j<row;j++) {
			if(j>=i) {
				System.out.print("  ");
			}
			else {
				System.out.print("* ");
			}
			
			
		}
		System.out.println();
	}
	for(int i=1;i<row;i++) {
		for(int j=0;j<row;j++) {
			if(j<i) {
				System.out.print("  ");
			}
			else {
				System.out.print("* ");
			}
			
		}
		for(int j=1;j<row;j++) {
			if(j<row-i) {
			System.out.print("* ");
			}
			
		
		else {
			System.out.print("  ");
		}
		}
		System.out.println();
	}
}
}
