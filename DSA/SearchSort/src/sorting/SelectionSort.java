package sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void selectionSort(int [] array) {
		int n= array.length;
		for(int i=0;i<n-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<n;j++) {
				if(array[j]<array[minIndex]) {
					minIndex=j;
				}
				
			}
			if(i!=minIndex) {
				int temp=array[i];
				array[i]=array[minIndex];
				array[minIndex]=temp;
				
			}
		}
		System.out.println("Sorted array by selection sort: "+Arrays.toString(array));
		
	}

	public static void main(String[] args) {
		int arr []= {85,43,958,64,200};
		selectionSort(arr);

	}

}
