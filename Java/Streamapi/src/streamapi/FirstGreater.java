package streamapi;

import java.util.Arrays;
import java.util.List;

public class FirstGreater {
	public static void main(String[] args) {
		System.out.println("First number greater than 5: ");
		List<Integer> list= Arrays.asList(5,34,12,34,56,77,78,3456);
		list.stream()
		.filter(n->n>5)
		.findFirst()
		.ifPresent(System.out::print);
		//.forEach(System.out::print);
	}
}
