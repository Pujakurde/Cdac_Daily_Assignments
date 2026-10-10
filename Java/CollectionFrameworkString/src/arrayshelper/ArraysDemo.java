package arrayshelper;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80};
		System.out.println("\nOriginal array 1 : "+ Arrays.toString(arr));
		
		//fill  the array with 90
		Arrays.fill(arr, 90);
		System.out.println("\nArray after fill: "+ Arrays.toString(arr));
		
		//fill(array,fromIndex,toIndex,value)
		Arrays.fill(arr, 1,5,10);
		System.out.println("\nArray after fill from and to index : "+ Arrays.toString(arr));
		
		//clone array
		int[] clonearr = arr.clone();
		System.out.println("\nCloned Array"+ Arrays.toString(clonearr));
		
		
		int arr1[]= {10,20,30,40,50,60,70,80};
		System.out.println("\nOriginal array 2: "+ Arrays.toString(arr1));
		System.out.println("\nArray equal or not: "+Arrays.equals(arr, arr1));
		
		Arrays.sort(arr);
		System.out.println("\nSorted array: "+ Arrays.toString(arr));

	}
}
