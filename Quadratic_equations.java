package sample;

import java.util.Scanner;

public class Quadratic_equations {
public static void main(String[] args) {
	   
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the coefficiant of x^2");
	int a=sc.nextInt();
	System.out.println("Enter the coefficiant of x");
	int b=sc.nextInt();
	System.out.println("Enter the constant term");
	int c=sc.nextInt();
	
	if(b*b-(4*a*c)==0) {
		float root=(float)(-b+Math.sqrt(b*b-(4*a*c)))/(2*a);
		System.out.println("The root is "+root);
	}
	
	else if(b*b-(4*a*c)<0) {
		System.out.println("The roots are imaginary");
	}
	else {
		float root1=(float)(-b+Math.sqrt(b*b-(4*a*c)))/(2*a);
		float root2=(float)(-b-Math.sqrt(b*b-(4*a*c)))/(2*a);
		System.out.println("The roots of the equation are "+root1+" "+root2);
	}
}
}
