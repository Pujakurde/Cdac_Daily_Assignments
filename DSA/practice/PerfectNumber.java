package practice;

public class PerfectNumber {
	public static void main(String[] args) {
		int n=6;
		System.out.println("The perfect number: "+perfectNo(n));
		
	}

	private static boolean perfectNo(int num) {
		int sum=1;
		if (num<=1){
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num % i ==0){
                sum=sum+i;
                sum=sum+num/i;
            }
        }
        return sum==num;
	}
}
