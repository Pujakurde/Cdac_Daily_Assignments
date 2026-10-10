package streamapi;

import java.util.Comparator;
import java.util.stream.Stream;

public class LongestString {
	public static void main(String[] args) {
		System.out.println("Descending Order of String: ");
		Stream<String> words= Stream.of("Aditya","Aradhya","amey","Bye","Hiii");

		//words.map(s->s.toUpperCase())
		words.max(Comparator.comparingInt(String::length)).get();
		System.out.println(words);
		
		//System.out.println(count);
		
	}

}
