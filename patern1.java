package sample;

import java.util.Scanner;

public class patern1 {
	public static void main(String[] args) {
		
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number of rows and column:");
	 int row=sc.nextInt();
	 int count=0;
	 
	 for(int i=1;i<row;i++) {
		 for(int j=1;j<=i;j++) {
			 count++;
			 System.out.format("%02d ",count);
			 
			 
		 }
		 System.out.println();
	 }
	}

}
