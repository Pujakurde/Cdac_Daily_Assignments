public class Digitsum
{
    public static void main(String[] args) 
	{
		int num=235;
		int r;
		int sum=0;
		while(num != 0)
		{
			r = num % 10;
			sum=sum+r;
		}
		System.out.println("Sum: "+ sum);
	}
}
