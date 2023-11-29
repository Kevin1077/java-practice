package jaVa;

import java.util.Scanner;

public class Largestelement {
	
	static int largest(int lim,int a[]) {
		int num = 0;
		for(int i=0;i<lim;i++) {
			if(num<a[i]) {
				num=a[i];
			}
			else
				continue;
		}
		return num;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a limit:");
		int lim=sc.nextInt();
		int []a=new int[lim+1];
		System.out.println("Enter values in the array");
		for(int i=0;i<lim;i++) {
			a[i]=sc.nextInt();
			
		}
		int c=largest(lim,a);
		System.out.println(c+" is the largest element");
	}

}
