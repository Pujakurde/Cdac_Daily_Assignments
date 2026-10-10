package customer;

import java.io.*;

public class LogFileDemo {

    public static void main(String[] args) {

        try {

            BufferedWriter bw =
              new BufferedWriter(
              new FileWriter("app.log"));

            bw.write("INFO: Application started");
            bw.newLine();

            bw.write("INFO: User login successful");
            bw.newLine();

            bw.write("ERROR: Database connection failed");
            bw.newLine();

            bw.write("INFO: User logout");
            bw.newLine();

            bw.write("WARNING: Low memory");
            bw.newLine();

            bw.write("ERROR: File not found");
            bw.newLine();

            bw.write("INFO: Application stopped");

            bw.close();

            System.out.println("Log File Created\n");

            BufferedReader br =
              new BufferedReader(
              new FileReader("app.log"));

            String line;

            System.out.println("Contents of Log File");
            System.out.println("---------------------");

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}