package Prime;

public class RunnableasLambda {
	public static void main(String[]args) {
		System.out.println("Prime number from 1 to 100");
		Thread t=new Thread(()->{
			for(int i=2;i<=100;i++) {
				boolean isPrime=true;
				for(int j=2;j<=i/2;j++) { 
					if(i%j==0) {
						isPrime=false;
						break;
					}
				}
				if(isPrime) {
					System.out.println(i);
				}
			}
		});
		t.start();
		
	}

}
