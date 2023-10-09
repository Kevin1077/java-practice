package sample;

import java.util.Scanner;

public class Matrixmultiplication {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column of matrix1");
		int row1=sc.nextInt();
		int col1=sc.nextInt();
		
		System.out.println("Enter the row and column of matrix2");
		int row2=sc.nextInt();
		int col2=sc.nextInt();
		
		int [][]matrix1=new int[row1][col1];
		int [][]matrix2=new int[row2][col2];
		int [][]result=new int[row1][col2];
		  if(col1==row2) {
			  int i,j,k;
			  System.out.println("Enter the numbers in matrix1");
			  for( i=0;i<row1;i++) {
				  for( j=0;j<col1;j++) {
					  matrix1[i][j]=sc.nextInt();
				  }
			  }
			  System.out.println("Enter the numbers in matrix2");
			  for( i=0;i<row2;i++) {
				  for(j=0;j<col2;j++) {
					  matrix2[i][j]=sc.nextInt();
		  }
		}
		  
		  for(i=0;i<row1;i++) {
			  for(j=0;j<col2;j++) {
				  for(k=0;k<col1;k++) {
					  result[i][j]+=(matrix1[i][k]*matrix2[k][j]);
					  
				  }
			  }
			  
		  }
		  for( i=0;i<row1;i++) {
			  for( j=0;j<col2;j++) {
				  System.out.print(result[i][j]+"\t");
			  }
			  System.out.print("\n");
		  }
		  
		  }
		  else {
			  System.out.print("matrix multiplication is not possible");
		  }
		  }
	}

   
