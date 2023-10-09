package sample2;

import java.util.Scanner;

public class Palintrome {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enetr a String");
		String input=sc.next();
		
		boolean ispalindrome=check(input);
		if(ispalindrome)
			System.out.println("The given string is a palindrome");
		
		else
			System.out.println("The given string is not a palindrome");
	}
	
	static boolean check(String input) {
		
		char []a=input.toCharArray();
		int length=input.length();
		
		for(int i=0;i<length/2;i++) {
			if(a[i]!=a[length-i-1]) {
				return false;
			}
		}
		return true;
	}

}
