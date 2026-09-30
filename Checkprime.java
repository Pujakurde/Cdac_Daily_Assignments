public class Checkprime {
    public static void main(String[] args) 
	{
        int num = 11;
		boolean prime =true;
		
	
		if(num<0)
		{
			System.out.println("The num is negative");
			//break;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				prime=false;
				//System.out.println("The num is not prime: "+num);
			}
			break;
		}
		if(prime)
		{
				
			System.out.println("The num is prime: "+num);
		}
		else
		{
				System.out.println("The num is not prime: "+num);
		}

	}
}