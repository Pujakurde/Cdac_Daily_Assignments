package practice;
public class ArmStrong {
	public static int findnoOfDigit(int num) {
		int noOfDigit=0;
		while(num>0) {
			//num=num%10;
			noOfDigit++;
			num=num/10;
		}
		
		return noOfDigit;
		
	}
	public static boolean isArmstrong(int num) {
		int n=num;
		int noOfDigit=0;
		noOfDigit=findnoOfDigit(num);
		int sum=0;
		while(n>0) {
			int digit=n%10;
			int power=(int)Math.pow(digit,noOfDigit);
			sum= sum+ power;
			n=n/10;
		}

		return sum==num;
		
		
		
	}
	public static void main(String[] args) {
		int n=153;
		System.out.println(isArmstrong(n));
		
	}

}
