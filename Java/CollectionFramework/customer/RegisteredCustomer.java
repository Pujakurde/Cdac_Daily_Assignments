package customer;

public class RegisteredCustomer extends Customer {

    private String region;

    public RegisteredCustomer(String name,
                              String emailId,
                              long contactNo,
                              String registrationDate,
                              String region) {

        super(name, emailId, contactNo, registrationDate);
        this.region = region;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nRegion : " + region +
               "\n-------------------------";
    }
}