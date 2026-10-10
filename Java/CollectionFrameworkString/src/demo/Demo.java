package demo;

import java.util.HashSet;
import java.util.Scanner;

public class Demo {
	//acept the string from use
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s =sc.nextLine();
		
		HashSet<String> set=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			int count=0;
			if(set.contains(ch)) {
				System.out.println("");
			}else {
				System.out.println(ch);
			}
		}
		
	}
}
