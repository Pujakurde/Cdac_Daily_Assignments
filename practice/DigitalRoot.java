package practice;

public class DigitalRoot {
	public static void main(String[] args) {
		int n= 9875;
		int digit =0;
		int sum=0;
		while(n>0) {
			digit=n%10;
			sum=sum+digit;
			n=n/10;
			if(sum> 9&& n==0) {
				n=sum;
				sum=0;
				
			}
			
		}
		
		System.out.println(sum);
		

}

}
