package fibonnaci;
public class Fibonnaci {
	public static int fibonnaci(int n) {
		if(n==0|| n==1) return 1;
		return fibonnaci(n-1)+fibonnaci(n-2); //recursion
	}

	public static void main(String[] args) {
		int n=5;
		System.out.println("Element in the fibonnaci series is: "+fibonnaci(n));

	}

	

}
