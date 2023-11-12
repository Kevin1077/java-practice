package sample;

import java.util.Scanner;

public class URL_check {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a URL:");
		String URL=sc.nextLine();
		
		String url=URL.substring(0,URL.indexOf(":"));
		
		switch(url) {
		case "http":System.out.println("The website is a Hypertext Transfer protocol");
		             break;
		     
		case "ftp":System.out.println("The website is a File Transfer protocol");
			
		}
		
		String urll=URL.substring(URL.lastIndexOf(".")+1);
		
		switch(urll) {
		
		case "com":System.out.println("It is a comercial website");
		break;
		
		case "org":System.out.println("It is an organization website");
		break;
		
		case "net":System.out.println("It is an Internet website");
		break;
			
		}
		
		
	}

}
