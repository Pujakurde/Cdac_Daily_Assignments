package regi;

class InvalidCountryException extends Exception {

    public InvalidCountryException() {
        super();
    }

    public InvalidCountryException(String message) {
        super(message);
    }
}

class UserRegistration {

    public void registerUser(String userName, String userCountry)
            throws InvalidCountryException {

        if (!userCountry.equalsIgnoreCase("India")) {

            throw new InvalidCountryException(
                "User Outside India cannot be registered"
            );
        }

        System.out.println("User registration done successfully");
    }
}

public class RegistrationDrmo {

    public static void main(String[] args) {

        UserRegistration user = new UserRegistration();

        try {
            user.registerUser("Puja", "India");
        }
        catch (InvalidCountryException e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}
