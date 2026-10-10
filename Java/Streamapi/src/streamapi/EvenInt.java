package streamapi;

import java.util.Arrays;
import java.util.List;

public class EvenInt {

	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(34,12,34,56,77,78,3456);
		list
		.stream()
		.filter(n->n%2==0)
		.forEach(System.out::println);
		

	}

}
