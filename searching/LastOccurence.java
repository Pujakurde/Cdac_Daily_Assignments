package searching;

public class LastOccurence {
	public static int searchRange(int[] nums, int target) {
		int n = nums.length;
	    int left = 0;
	    int right = n - 1;
	    int last = -1;
	
	    while (left <= right) {
	        int mid = left + (right - left) / 2;
	
	        if (nums[mid] == target) {
	            last = mid;
	            left = mid + 1; 
	        }
	        else if (nums[mid] < target) {
	            left = mid + 1;
	        }
	        else {
	            right = mid - 1;
	        }
	    }
	
	    return last;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 2, 3, 4, 5};

        System.out.println("The Last Occurence of target is: "+searchRange(arr, 2));

	}

}
