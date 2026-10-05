package arrayreverse;
public class Reverse {

	public static void main(String[] args) {
		int digit =0;
		int x=12345;
		int reverse=0;
		System.out.println("The reverse of no: "+x);
		while(x!=0){
			digit =x%10;
			reverse=reverse*10+digit;
			x=x/10;
		}
		System.out.print("is: "+reverse);

	}

}
