package factors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factors {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {

                System.out.print("Enter a number (00 to quit): ");
                String input = br.readLine();

                if (input.equals("00")) {
                    System.out.println("Program terminated.");
                    break;
                }

                int number = Integer.parseInt(input);

                System.out.print("Factors of " + number + " are: ");

                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        System.out.print(i + ",");
                    }
                }

                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
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