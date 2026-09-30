import java.util.Scanner;
public class Midmax
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements: ");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements of array: ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
		int max=arr[0];
		int min =arr[0];
		for(int i=0;i<arr.length;i++)
		{
			
			if (arr[i] > max)max=arr[i];
			if(arr[i] < min)min =arr[i];
			
			
		}
		System.out.println("Maxmimum Element of array: "+max);
			
		System.out.println("Minimum Element of array: "+min);
	}
	
}
		