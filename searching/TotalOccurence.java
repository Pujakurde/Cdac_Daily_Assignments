package searching;

public class TotalOccurence {
	public static int firstOcc(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] ==target) {
                first = mid;
                right = mid - 1; // keep searching on left side
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return first;
    }
	
	public static int lastOcc(int[] nums, int target) {
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
		int[] nums = {1, 2, 2, 2, 3, 4, 5};
		System.out.println("Total occurence: "+(lastOcc(nums,2)-firstOcc(nums, 2)+1));
		

	}

}
