package sample;

import java.util.Scanner;

public class Word_Frequency {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a sentance");
		String str=sc.nextLine();
		str=str.replaceAll("\\s+"," ").trim();
		String words[]=str.split("\\s");
		
		System.out.println("The number of words = "+words.length);
	}

}
