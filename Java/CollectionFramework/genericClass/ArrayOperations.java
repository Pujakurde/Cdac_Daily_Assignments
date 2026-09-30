package generiClass;

public class ArrayOperations {
	
	public static <T> void printArray( T [] arr) {
		for(T n : arr)
			System.out.println(n + "*****");
	}
	
	public static <T> boolean search(T [] arr, T key) {
		boolean flag = false;
		for(T obj : arr) {
			if(obj.equals(key))
				flag = true;
		}
		return flag;
	}

}
