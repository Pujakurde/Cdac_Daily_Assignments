public class Fibonnaci
{
    public static void main(String[] args) 
	{
		int n=10;
		int f=0;
		int t=1;
		int nt=0;
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(f+" ");
			nt=f+t;
			f=t;
			t=nt;
		}
		
	}
}