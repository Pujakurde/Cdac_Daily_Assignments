package sorting;

import java.util.Arrays;

public class BubbleSort {
	
	public static void bubbleSort(int [] arr) {
		int n=arr.length;
		
		boolean swapped =false; 
		//no of  passes =n-1
		for(int i=0;i<n-1;i++) {
			
			swapped=false;
			//no of comparison: n-i-1
			for (int j=0;j<n-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					swapped=true;
					
					System.out.println("Swapped at index: "+j);
				}
			}
			if(!swapped) {
				break;
			}
					
		}   
		System.out.println("\nFull Sorted by Bubble Sort: "+Arrays.toString(arr));	

	}
	
	public static void main(String[] args) {
		int arr []= {85,43,958,64,200};
		bubbleSort(arr);
		
	}
	

}
