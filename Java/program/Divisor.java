public class Factorial {
    public static void main(String[] args) 
	{
        int num = 24;
		System.out.print("The divisior of : "+num" are: ");
		for(int i=1;i<num;i++)
		{
			if (num%i==0)
			{
				System.out.print(i+" ");
			}
		}

	}
}