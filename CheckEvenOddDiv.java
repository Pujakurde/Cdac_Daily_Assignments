/*
 Given an integer count the digits that are even ,odd,and divisible by 3
 Given N integer ,cout how many digits are even ,odd,divisible by 3
 */
public class CheckEvenOddDiv {

	public static void main(String[] args) {
		
		int x=124;
		int digit =0;
		int NoofEven=0,NoofOdd=0,NoofDivbythree=0;
		 
		while(x!=0)
		{
			digit =x%10;
			
			if(x%2==0) {
				NoofEven++;
			}
			else {
				NoofOdd++;
			}
			if(digit %3==0) {
				NoofDivbythree++;
			}
			x=x/10;
		}
		System.out.println("The no of Even number: "+NoofEven);
		System.out.println("The no of Odd number: "+NoofOdd);
		System.out.println("The no of Divisible by 3: "+NoofDivbythree);

	}

}
