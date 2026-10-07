package practice;
public class SecondLargest {
	public static void main(String[] args) {
		int arr []= {10,10,10};
		
		int secondLargest=0;
		int firstLargest=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>firstLargest) {
				secondLargest=firstLargest;   
				firstLargest=arr[i];
			}
			else if(arr[i]> secondLargest) {
				secondLargest= arr[i];
			}
			else {
				secondLargest= -1;
				
			}
			
		}
		System.out.println(secondLargest);
		

	}

}
