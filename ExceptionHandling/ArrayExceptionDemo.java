import java.util.Scanner;
public class ArrayExceptionDemo {

	public static void main(String[] args) {
		try {
			
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter array size: ");
			int size=sc.nextInt();
			int[]arr=new int [size];
			
			System.out.println("Enter array elements: ");
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			
			System.out.println("Enter index number: ");
			int index=sc.nextInt();
			System.out.println("Array elements: "+arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: Invalid array index.");
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Error: ARRAY SIZE CANNOT BE NEGATIVE");
		}
		catch(Exception e)
		{
			System.out.println("Error: ANOTHER ERROR.");
		}
	}

}
