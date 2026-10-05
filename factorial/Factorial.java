package factorial;

public class Factorial {
	public static int factorialOfn(int n) {
		if(n==0|| n==1) return 1;
		int factorial=n*factorialOfn(n-1); //recursion 
		return factorial;
	}

	public static void main(String[] args) {
		int n=5;
		System.out.println("Factorial of "+n+" is: "+factorialOfn(n));

	}

	

}
