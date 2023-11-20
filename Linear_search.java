package sample;

import java.util.Scanner;

public class Linear_search {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int []a= {1,2,3,4,5};
		System.out.println("Enter the element to search?");
		int search=sc.nextInt();
		int count=0;
		for(int x:a) {
			if(x==search) {
				System.out.println("The element is found in the array");
				break;
				
			}
			else {
				count++;
			}
		}
		if(count==a.length) {
			System.out.println("The element is not found in the array");
		}
		
		
	}

}
