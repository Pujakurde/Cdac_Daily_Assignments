package searching;

public class BinarySearchUsingRecursion {
	public static int Bsearch(int []arr,int target,int start,int end) {
		if(start>end) {
			return -1;
		}
		int mid=start+(end-start)/2;
		if(arr[mid]==target) {
			return mid;
		}
		if(target<arr[mid]) {
			return Bsearch(arr,target,start,mid-1);
		}
		else {
			return Bsearch(arr,target,mid+1,end);
		}

	}

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6	};
		int target=6;
		System.out.println("Number search at index: "+Bsearch(arr,target,0,arr.length-1));
		
	}
}
