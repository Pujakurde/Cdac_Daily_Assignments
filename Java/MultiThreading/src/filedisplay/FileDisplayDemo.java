package filedisplay;

public class FileDisplayDemo {

	public static void main(String[] args) {
		FileDisplay j1 = new FileDisplay("D:/java/JavaWorkspace/MultiThreading/src/filedisplay/datas.txt");
		FileDisplay j2 = new FileDisplay("D:/java/JavaWorkspace/MultiThreading/src/filedisplay/emails.txt");
		FileDisplay j3 = new FileDisplay("D:/java/JavaWorkspace/MultiThreading/src/filedisplay/logfile.txt");
		
		System.out.println("File display will begin....");
		
		//runnable
		j1.getT().start();
		j2.getT().start();
		j3.getT().start();
		
		//main thread should wait
		try {
			j1.getT().join();
			j2.getT().join();
			j3.getT().join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("File display will end....");
		

	}

}
