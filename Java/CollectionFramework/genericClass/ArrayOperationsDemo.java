package generiClass;
import java.util.ArrayList;
import java.util.List;

public class ArrayOperationsDemo {

	public static void main(String[] args) {
		Integer [] arr = {45,32,78,11,90};
		ArrayOperations.printArray(arr);
		System.out.println("The search: "+ArrayOperations.search(arr,45));
		
		System.out.println();
		String [] words = {"java","python","javascript"};
		ArrayOperations.printArray(words);
		System.out.println("The search: "+ArrayOperations.search(words,"python"));
		

	}
}