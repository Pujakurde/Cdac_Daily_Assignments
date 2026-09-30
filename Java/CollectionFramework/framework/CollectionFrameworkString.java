package framework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class CollectionFrameworkString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		System.out.println("Enter number of strings: ");
		int n=sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter string "+(i+1)+":");
			String str=sc.nextLine();
			list.add(str);
	
		}
		
		System.out.println("Collection : \n"+ list);
		
		System.out.println("Enter the index to remove the element from the list: ");
		int index=sc.nextInt();
		
		if(index>=0 && index< list.size())
		{
			list.remove(index);
			System.out.println("Collection after removing: \n"+ list);
		}
		else
			System.out.println("Invalid Index.");
		
		sc.close();
		
	}

}
