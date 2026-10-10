package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Sumno {
	public static void main(String[] args) {
		System.out.println("Sum of numbers ");
		List<Integer> list= List.of(577,78,3456,34,12,34,56);
		Optional<Integer> sum = list.stream()
				.reduce((a,b) ->a+b);
		System.out.println(sum);
	}

}
