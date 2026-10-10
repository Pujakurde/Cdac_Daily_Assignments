package backdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackData {

    public static void main(String[] args) {

        BufferedReader br = null;
        FileWriter fw = null;
        BufferedReader fr = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter file name : ");
            String fileName = br.readLine();

            fw = new FileWriter(fileName);

            System.out.println("Enter data ('quit' to stop)");

            String line;
            while (!(line = br.readLine()).equals("quit")) {
                fw.write(line + "\n");
            }

            fw.close();

            System.out.println("\nFile writing completed");

            fr = new BufferedReader(new FileReader(fileName));

            System.out.println("\nData from file :");

            while ((line = fr.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("\nFile reading completed");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}