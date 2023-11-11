package sample;

import java.util.Scanner;

public class Check_Type {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a binary or hexadecimal number:");
		
	    String str=sc.next();
	    
	    if (str.matches("[10]*") == true)
	    		System.out.println(str+" is a binary number");
	    
	    else if(str.matches("[A-F 0-9]*")== true)
	    	
	    	System.out.println(str+" is a hexadecimal number");
	    else
	    	System.out.println(str+" is not a binary or hexadecimal number");
	}
}
