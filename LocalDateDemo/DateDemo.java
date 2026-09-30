package LocalDateDemo;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import LocalDateDemo.AgeException;

public class DateDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Day:");
            int day = sc.nextInt();

            System.out.println("Enter Month:");
            int month = sc.nextInt();

            System.out.println("Enter Year:");
            int year = sc.nextInt();

            LocalDate birthdate = LocalDate.of(year, month, day);
            LocalDate currentDate = LocalDate.now();

            Period age = Period.between(birthdate, currentDate);

            System.out.println("Age: " + age.getYears() + " years");

            if (age.getYears() > 18) {
                System.out.println("Valid.");
            } else {
                throw new AgeException("Age is less than or equal to 18");
            }

        } catch (AgeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid date or input.");
        }

        sc.close();
    }
}