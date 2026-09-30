package person;


class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class Person {
    private String name;
    private int age;

    Person(String name, int age) throws InvalidNameException {

        if (name == null || name.length() == 0) {
            throw new InvalidNameException("Name cannot be empty");
        }

        // First letter should be capital
        if (!Character.isUpperCase(name.charAt(0))) {
            throw new InvalidNameException(
                "First letter of name should be capital"
            );
        }

        // Remaining letters should be small
        for (int i = 1; i < name.length(); i++) {
            if (!Character.isLowerCase(name.charAt(i))) {
                throw new InvalidNameException(
                    "Remaining letters of name should be small"
                );
            }
        }

        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class PersonDemo {
    public static void main(String[] args) {

        try {
            Person p = new Person("Puja", 22);
            p.display();
        }
        catch (InvalidNameException e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}