package sorting;

import java.util.Arrays;

public class InsertionSort {
	public static String insertionSort(int array []) {
		int n= array.length;
		for(int index=1;index<n;index++) {
			int place=array[index];
			int position=index-1;
			while(position>=0 && array[position]>place) {
				array[position+1]=array[position];
				position--;
				
			}
			array[position+1]=place;
		}
		return Arrays.toString(array);
		
		
	}

	public static void main(String[] args) {
		int arr []= {85,43,958,64,200};
		System.out.println(insertionSort(arr));

	}

}
