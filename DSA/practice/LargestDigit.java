package practice;

public class LargestDigit {
	public static int largestDigit(int num) {
		int x=num;
		int max=0;
		while(x!=0) {
			int digit=x%10;
			if(digit>max) {
				max=max+digit;
			}
			x=x/10;
			
		}
		return max;
		
		
	}

	public static void main(String[] args) {
		int num=1234568;
		System.out.println(largestDigit(num));

	}

}
