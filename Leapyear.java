package sample;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year you want to check?");
		int year=sc.nextInt();
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println(year+" is a leapyear");
				}
				else {
					System.out.println(year+" is not a leapyear");
				}
			}
			else {
				System.out.println(year+" is a leapyear");
				}
		}
				
		else {
				System.out.println(year+" is a leapyear");
			}
		
		}
}
		