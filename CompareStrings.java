import java.util.Scanner;

public class CompareStrings {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Strings:");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		int compare=str1.compareTo(str2);
		
		if(compare<0)
			System.out.println(str1+" less than "+str2);
		else if(compare==0)
			System.out.println(str1+" equal to "+str2);
		else
			System.out.println(str1+" greater than "+str2);
			
	}

}
