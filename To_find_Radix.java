package sample;

import java.util.Scanner;

public class To_find_Radix {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a type of number:");
		String number=in.next();
		
		if(number.matches("[01]*")== true) {
			
			System.out.println(number+" is binary number, radix=2");
		}
		else if(number.matches("[1-7]*")== true) {
			
			System.out.println(number+" is octal number, radix=8");
		}
        else if(number.matches("[0-9]*")== true) {
			
			System.out.println(number+" is decimal number, radix=10");
        }
			
		else if(number.matches("[0-9A-F]*")== true) {
			
			System.out.println(number+" is hexadecimal number, radix=16");
		}
		
		
		else {
			System.out.println("Invalid number!!!!");
		}
	}

}
