package sorting;

import java.util.Arrays;

public class QuickSort {
	public static void quickSort(int [] arr,int low,int high) {
		if(low<high) {
			int findPartition=findByPartition(arr,low,high);
			quickSort(arr,low,findPartition-1);
			quickSort(arr,findPartition+1,high);
		}
	}
	public static int findByPartition(int [] arr,int low,int high) {
		int fence=low-1;
		int pivot=arr[high];
		
		for(int i = low;i<high;i++) {
			if(arr[i]<pivot) {
				fence+=1;
				swap(arr,fence,i);
			}
		}
		swap(arr,fence+1,high);
		return fence+1;
	}

	private static void swap(int[] arr, int index1, int index2) {
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}

	public static void main(String[] args) {
		int arr[] = { 7,2,1,6,8,5,3};
		int low=0;
		int high=arr.length-1;
		quickSort(arr,low,high);
		System.out.println(Arrays.toString(arr));

	}

}
