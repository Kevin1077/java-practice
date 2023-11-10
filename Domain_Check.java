package sample;

public class Domain_Check {

	public static void main(String[] args) {
		
		String str="programmer@gmail.com";
		
		int i=str.indexOf('@');
		int len=str.length();
		String str1=str.substring(0, i);
		String str2=str.substring(i+1, len);
		
		if(str2.compareTo("gmail.com")== 0){
			
			System.out.println("The username is: "+str1);
			System.out.println("The domain name is: "+str2);
		}
			else {
				System.out.println("Wrong domain!!!");
			}
		}
		
	}

