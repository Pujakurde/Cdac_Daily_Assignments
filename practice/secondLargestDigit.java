package practice;
public class secondLargestDigit {
	public static void main(String[] args) {
		int n= 3542;
		int digit ;
		int secondLargest=0;
		int firstLargest=0;
		while(n!=0) {
			digit=n%10;
			if(digit>firstLargest) {
				secondLargest=firstLargest;   
				firstLargest=digit;
			}
			else if(digit> secondLargest) {
				secondLargest= digit;
			}
			n=n/10;
		}
		System.out.println(secondLargest);
		

	}

}
