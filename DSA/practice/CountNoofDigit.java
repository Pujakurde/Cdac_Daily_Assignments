package practice;

public class CountNoofDigit {
	public static int countNoOfDigits(int num) {
		int x=num;
		int count=0;
		while(x>0) {
			//int digit=x%10;
			count++;
			x=x/10;
		}
		return count;
	}
	public static void main(String[] args) {
		int num=5345678;
		System.out.println(countNoOfDigits(num));
	}

}
