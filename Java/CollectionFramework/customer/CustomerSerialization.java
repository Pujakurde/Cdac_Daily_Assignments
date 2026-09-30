package customer;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class CustomerSerialization {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        ObjectOutputStream oos =
          new ObjectOutputStream(
          new FileOutputStream("customer.dat"));

        for(int i=1;i<=5;i++) {

            System.out.println("\nEnter Customer " + i);

            System.out.print("Name : ");
            String name = sc.nextLine();

            System.out.print("Email : ");
            String email = sc.nextLine();

            System.out.print("Contact No : ");
            long contact = Long.parseLong(sc.nextLine());

            System.out.print("Registration Date : ");
            String regDate = sc.nextLine();

            System.out.print("Region : ");
            String region = sc.nextLine();

            RegisteredCustomer c =
             new RegisteredCustomer(
                     name,
                     email,
                     contact,
                     regDate,
                     region);

            oos.writeObject(c);
        }

        oos.close();
        sc.close();

        System.out.println("\n5 Customer Records Saved.");
    }
}