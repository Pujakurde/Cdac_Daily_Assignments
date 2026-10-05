package sum;

public class SumOfNumber {
	public static int sumofNumber(int[] arr, int k) {
		if(arr.length==k) {
			return 0;
		}
		return arr[k]+sumofNumber(arr,k+1);
	 }
	
	 public static void main(String[] args) {
		 int arr[]= {1,2,3,4,5,6};
		 int k=2;
		 int sum=sumofNumber(arr,k);
		 System.out.println("The sum is: "+sum);
	}

	 
		 
}

