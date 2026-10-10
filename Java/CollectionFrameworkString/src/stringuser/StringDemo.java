package stringuser;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class StringDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Set<String> words =
				new TreeSet<> ((s1,s2)->{
			int diff=s1.length()-s2.length();
			if (diff==0)
					diff=s1.compareTo(s2);
			return diff;
		});
		
		for(int i=0;i<5;i++) {
			words.add(sc.nextLine());
		}
		System.out.println("Strings sorted by length them alphabetcally.: ");
		words.forEach(System.out::println);
		sc.close();

	}

}
