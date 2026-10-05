package practice;

import java.util.Arrays;

public class DuplicateElements {

	public static void main(String[] args) {
		int arr[]= {1,2,23,52,2,2,3,3,4};
		System.out.println("is duplicate: "+isDuplicateElements(arr));

	}

	private static boolean isDuplicateElements(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if (arr[i]==arr[i+1]) {
				return true;
				
			}
		}
		return false;
	}
}
