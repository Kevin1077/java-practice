package sample;

import java.util.Scanner;

public class Calculator_switch {
     public static void main(String[] args) {
		
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter two numbers:");
    	 int number1=sc.nextInt();
    	 int number2=sc.nextInt();
    	 sc.nextLine();
    	 System.out.println("Enter the operation you want to perform: add, sub, mul, div:");
    	 String option=sc.nextLine();
    	 option=option.toUpperCase();
    	 
    	 switch(option)
    	 {
    	 case "ADD":
    		 int sum=number1+number2;
    		 System.out.println("Sun is: "+sum);
    		 break;
    	 case "SUB":
    		 int sub=number1-number2;
    		 System.out.println("Difference is "+sub);
    		 break;
    	 case "MUL":
    		 int product=number1*number2;
    		 System.out.println("Product is: "+product);
    		 break;
    	 case "DIV":
    		 float div=(float)number1/number2;
    		 System.out.println("The result is: "+div);
    		 break;
         default:
        	 System.out.println("Option is Invalid!!!");
    	 }
	}
}
