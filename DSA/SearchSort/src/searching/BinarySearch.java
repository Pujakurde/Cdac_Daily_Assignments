package searching;

public class BinarySearch {
	public static int binarySearch(int [] array,int target) {
		//int target= 200;
		int n= array.length;
		int left=0;
		int right=n -1;
		
		//m
		
		while(left<=right) {
			//int mid=(left+right)/2;
			int mid=left+(right-left)/2;
			if(array[mid]==target) {
				return mid;
			}
			if(target<array[mid]) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int [] arr = {43, 64, 85, 200, 958};
		System.out.println("The index of target is: "+binarySearch(arr,200));
		

	}

}
