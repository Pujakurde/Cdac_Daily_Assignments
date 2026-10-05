package practice;

public class CountOddDigit {
	
	public static int countOddNoOfDigits(int num) {
		int x=num;
		int count=0;
		while(x>0) {
				int digit=x%10;
				
				if(digit%2!=0) {
					count++;
				}
				x=x/10;
			
		}
		return count;
	}
	public static void main(String[] args) {
		int num=5345678;
		System.out.println(countOddNoOfDigits(num));
	}
}