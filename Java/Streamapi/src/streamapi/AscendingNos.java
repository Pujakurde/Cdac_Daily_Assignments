package streamapi;

import java.util.Arrays;
import java.util.List;

public class AscendingNos {
	public static void main(String[] args) {
		System.out.println("Ascending numders: ");
		List<Integer> list= Arrays.asList(577,78,3456,34,12,34,56);
		list.stream()
		.sorted((a,b)->a-b)
		.forEach(System.out::println);
	}

}
