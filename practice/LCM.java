package practice;

public class LCM {

	public static void main(String[] args) {
		int num1=2;
		int num2=3;
		System.out.println("LCM is: "+lcm(num1,num2));

	}

	private static int gcd(int num1, int num2) {
		
		while(num2!=0) {
			int temp=num2;
			num2=num1%num2;
			num1=temp;
		}
		return num1;
	}

	private static int lcm(int num1, int num2) {
		int n1=num1;
		int n2=num2;
		int result=(n1*n2)/gcd(n1,n2);
		return result;
	}

}
