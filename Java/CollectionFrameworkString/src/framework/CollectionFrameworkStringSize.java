package framework;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class CollectionFrameworkStringSize {


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
		
		System.out.println("Size of the collection: "+list.size());
		
		//display through iteration for each loop
		for(String s:list)
			System.out.println("Display throgh for each loop: "+s);
		
		//display through iteration using  iterator
		Iterator<String> it =list.iterator();
		while(it.hasNext())
			System.out.println("\nDisplay through iterator: "+it.next());
		
		//sort 
		Collections.sort(list);
		System.out.println("The Sorted list is: ");
		System.out.print(list);
		
		//utility class
		Collections.reverse(list);
		System.out.println("\nThe reverse order of " +list+" is ");
		System.out.print(list);
		
		
		// search
		System.out.println("\nEnter the string to search: ");
		sc.nextLine(); // consume leftover newline after nextInt()
		String search = sc.nextLine();

		int i = list.indexOf(search);

		if(i != -1)
		    System.out.println("String found at the index: " + i);
		else
		    System.out.println("String not found.");
		sc.close();
	}
	

}
