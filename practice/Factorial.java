package practice;

public class Factorial {
	public static int factorial(int num) {
		int factorial=1;
		if(num==0||num==1) {
			return 1;
		}
		for(int i=2;i<=num;i++) {
			factorial*=i;
			
		}
		return factorial;
		
	}

	public static void main(String[] args) {
		int num=5;
		System.out.println("The factorial is: "+factorial(num));
	}
}
