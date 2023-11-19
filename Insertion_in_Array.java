package sample;

import java.util.Scanner;

public class Insertion_in_Array {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array:");
		int n=sc.nextInt();
		int[] a=new int[30];
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<n;i++) {
			
			a[i]=sc.nextInt();
			
		}
		System.out.println("Elements in the array are:");
for(int i=0;i<n;i++) {
			
			System.out.print(a[i]+" ");
		}
        System.out.println();
		System.out.println("Enter the element to insert:");
		int key=sc.nextInt();
		System.out.println("Enter the Index at which element is to be Inserted:");
		int index=sc.nextInt();
		int temp;
		System.out.println("The new array is:");
		for(int i=0;i<n+1;i++) {
			if(i>=index) {
				temp=a[i];
				a[i]=key;
				key=temp;
			}
			System.out.print(a[i]+" ");
		}
	}

}
