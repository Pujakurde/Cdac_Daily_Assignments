package practice;

public class GCD {
	public static int gcd(int a,int b) {
		//int limit=Math.min(a, b);
		//int gcd=0;
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}

	public static void main(String[] args) {
		int num1=12;
		int num2=18;
		System.out.println("GCD is: "+gcd(num1,num2));

	}

}
