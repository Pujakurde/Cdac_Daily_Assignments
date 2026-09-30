public class Date
{
	
		private int dd;
		private int mm;
		private int yy;
		public static int count=0;
		
		public Date()
		{
			count++;
			dd=mm=yy=0;
			System.out.println("Object created :"+ count);
		}
		
		public Date(int d,int m,int y)
		{
			dd = d;
			mm = m;
			yy = y;
			count++;
			System.out.println("Object created :"+ count);
		}
		
		
		
		public void display()
		{
			
			System.out.println(dd+"/"+mm+"/"+yy);
		}
		
		
		
		
		
		
}