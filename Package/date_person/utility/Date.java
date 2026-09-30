package utility;
public class Date
{
	int d,m,y;
	public Date()
	{
		d=m=y=0;
	}
	public Date(int a,int b, int c)
	{
		d=a;
		m=b;
		y=c;
	}
	public String display()
	{
		return d+"/"+m+"/"+y;
	}
}