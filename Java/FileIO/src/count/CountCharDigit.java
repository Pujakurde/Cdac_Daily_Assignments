package count;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountCharDigit {

    public static void main(String[] args) {

        BufferedReader br = null;
        int charCount = 0;
        int digitCount = 0;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter characters ('q' to quit):");

            int i;

            while ((i = br.read()) != 'q') {

                char ch = (char) i;

                
                if (ch != '\n') {

                    if (Character.isAlphabetic(ch)) {
                        charCount++;
                    }

                    if (Character.isDigit(ch)) {
                        digitCount++;
                    }

                    
                }
            }
            //System.out.println("You entered: " + ch);

            System.out.println("\nTotal Characters: " + charCount);
            System.out.println("Total Digits: " + digitCount);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
