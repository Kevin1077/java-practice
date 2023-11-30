package sample;

import java.util.Scanner;

public class HCFof2Nos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("The GCD of "+num1+" and "+num2+" is "+gcd(num1,num2));
	}
		static int gcd(int num1,int num2) {
			while(num1!=num2) {
				if(num1>num2) {
					num1=num1-num2;
				}
				else {
					num2=num2-num1;
				}
		}
			return num1;
			
		}
}
		
	


