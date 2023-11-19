package sample;

public class IncreaseSizeOfArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		System.out.println("Length of array before is "+a.length);
		int[] b=new int[2*a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		a=b;
		b=null;
		System.out.println("Length after is "+a.length);
	}

}
