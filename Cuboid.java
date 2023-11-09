package sample;

import java.util.Scanner;

public class Cuboid {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter length,breadth,height of a cuboid");
	int length=sc.nextInt();
	int breadth=sc.nextInt();
	int height=sc.nextInt();
	
	
	int area=2*(length*breadth+length*height+breadth*height);
	int volume=length*breadth*height;
	
	System.out.println("The area="+area+" Volume="+volume);
}
}
