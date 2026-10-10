package primeinrange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime extends Thread
{
	int start;
	int end;

	public Prime(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		System.out.println("Prime numbers: ");
		for(int i=start;i<=end;i++) {
			if (i<2)
				continue;
			boolean prime=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					prime=false;
					break;
				}
			}
		if(prime) {
			System.out.println(i);
		}
		
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Enter start number: ");
		
		int start=Integer.parseInt(br.readLine());
		System.out.println("Enter end number: ");
		int end=Integer.parseInt(br.readLine());
		Prime p=new Prime(start,end);
		p.start();
		p.join();
	}
}
