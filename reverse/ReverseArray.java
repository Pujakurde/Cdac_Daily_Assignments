package reverse;

public class ReverseArray {
	 public void reverseArray(int [] array) {
		 int temp=0;
		 int start=array[0];
		 int end = array.length-1;
		 
		 while(start<end) {
			 temp=start;
			 start=end;
			 end=temp;
			 
			 System.out.print(start+" ");
			 
			 
		 }
		 
		 System.out.println();
		
	}

	 public void main(String[]args) {
		int [] arr = { 1,2,3,55,33,44,43};
		reverseArray(arr);
		
	}
	
	

} 

