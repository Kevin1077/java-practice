package sample;

import java.util.Scanner;

public class Area_of_triangle {
	
	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);
		    
		    
		    System.out.println("Enter if triangle is right triangle or not?yes/No");
		    char check=sc.next().charAt(0);
		    if(check=='y'||check=='Y') {
			System.out.println("Enter the base and height of the triangle:");
			int height=sc.nextInt();
			int base=sc.nextInt();
			
			float area=(float)0.5f*height*base;
			System.out.println("The area is "+area);
		}
		    else {
		    	System.out.println("Enter the sides of the triangle:");
		    	int a=sc.nextInt();
		    	int b=sc.nextInt();
		    	int c=sc.nextInt();
		    	
		    	float s=(float)(a+b+c)/2;
		    	float area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		    	System.out.println("The area is "+area);
		    }
 	
	}
}
