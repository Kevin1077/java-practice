import java.util.Scanner;

public class Amstrong {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	System.out.println("Enter the power:");
	int power=sc.nextInt();
	int rem,product=0;
	int newnum=num;
	while(num>0)
	{
		rem=num%10;
		product=product+(int)Math.pow(rem,power);
		num=num/10;
		
	}
	if(newnum==product)
	{
		System.out.println(newnum+" is amstrong");
	}
	else
	{
		System.out.println(newnum+" is not an amstrong");
	}
	
}
}
