import java.util.Scanner;

public class Stringdemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String str=sc.next();
		
		System.out.println("Enter the position of character to display:");
		int pos=sc.nextInt();
		
		System.out.println("Character at "+pos+" is "+str.charAt(pos));
	}

}
