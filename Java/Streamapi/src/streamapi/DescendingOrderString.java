package streamapi;

import java.util.Comparator;
import java.util.stream.Stream;

public class DescendingOrderString {
	public static void main(String[] args) {
		System.out.println("Descending Order of String: ");
		Stream<String> words= Stream.of("Aditya","Aradhya","amey","Bye","Hiii");

		//words.map(s->s.toUpperCase())
		words.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);;
		
		//System.out.println(count);
		
	}


}
