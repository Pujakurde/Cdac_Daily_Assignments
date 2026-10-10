package streamapi;

import java.util.stream.Stream;

public class StartwithA {
	public static void main(String[] args) {
		System.out.println("Count no of A ");
		Stream<String> words= Stream.of("Aditya","Aradhya","amey","Bye","Hi");

		long count= words.map(s->s.toUpperCase())
		.filter(s->s.startsWith("A"))
		.count();
		System.out.println(count);
		
	}

}
