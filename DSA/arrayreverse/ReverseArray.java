package arrayreverse;

import java.util.Arrays;

public class ReverseArray {
	 public static void reverseArray(int [] array1) {
		 int start=0;
		 int end = array1.length-1;
		 
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

	 public static void main(String[]args) {
		int [] arr = {1,2,3,4,5,6};
		reverseArray(arr);
		
	}
	
	

} 

