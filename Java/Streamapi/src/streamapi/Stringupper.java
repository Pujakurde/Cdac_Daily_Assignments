package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stringupper {

	public static void main(String[] args) {
		
		Stream <String> list= Stream.of("Hi","hello","bye");
		list.map(String::toUpperCase).forEach(System.out::println);
		

	}

}
