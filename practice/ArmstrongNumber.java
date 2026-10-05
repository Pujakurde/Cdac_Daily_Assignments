package practice;

public class ArmstrongNumber {
	public static int findnoOfDigit(int num) {
		int noOfDigit=0;
		while(num>0) {
			//num=num%10;
			noOfDigit++;
			num=num/10;
		}
		
		return noOfDigit;
		
	}

	public static void main(String[] args) {
		int num=153;
		System.out.println("is armstrong: "+isArmstrongNo(num));

	}

	private static boolean isArmstrongNo(int num) {
		int n=num;
		int noOfDigit=0;
		noOfDigit=findnoOfDigit(num);
		//boolean isArmstrong=false;
		int sum=0;
		
		while(n>0) {
			int digit=n%10;
			int power =(int)Math.powExact(digit, noOfDigit);
			sum= sum+ power;
			n=n/10;
			
			
		}
		return sum==num;
	}

}
