package customer;

import java.io.Serializable;

public class Customer implements Serializable {

    private String name;
    private String emailId;
    private long contactNo;
    private String registrationDate;

    public Customer(String name, String emailId,
                    long contactNo,
                    String registrationDate) {

        this.name = name;
        this.emailId = emailId;
        this.contactNo = contactNo;
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "Name : " + name +
               "\nEmail : " + emailId +
               "\nContact : " + contactNo +
               "\nRegistration Date : " + registrationDate;
    }
}