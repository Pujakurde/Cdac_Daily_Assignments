package apps;

public class RunnableasLamda {
	public static void main(String[]args) {
		Thread t=new Thread(()->{
			for(int i=1;i<=100;i++) {
				if(i%3==0||i%5==0) {
					System.out.println("Divisible by 3 or 5: "+i);
				}
			}
		});
		t.start();
		
	}

}
