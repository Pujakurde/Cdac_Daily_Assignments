package rotate;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6};
		rotatebyk(arr,2);
		

	}
	public static void reverseArray(int [] array1,int start,int end) {
		 
		 while(start<=end) {
			 int temp=array1[start];
			 array1[start]=array1[end];
			 array1[end]=temp;
			 
			 start++;
			 end--;
			 //System.out.print(start+" "); 
		 }
		 
		 System.out.println(Arrays.toString(array1));
		
	}
	public static void rotatebyk(int [] array1,int k) {
		int n=array1.length;
		reverseArray(array1, 0, n  - 1);
		reverseArray(array1, 0, k - 1);
		reverseArray(array1, k, n - 1);

		
	}

}
