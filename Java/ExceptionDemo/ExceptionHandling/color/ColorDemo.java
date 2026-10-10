package color;


class InvalidColorException extends Exception {
    public InvalidColorException(String message) {
        super(message);
    }
}

class Color {
    private int red;
    private int green;
    private int blue;

    Color(int red, int green, int blue) throws InvalidColorException {

        if (red < 0 || red > 255 ||
            green < 0 || green > 255 ||
            blue < 0 || blue > 255) {

            throw new InvalidColorException(
                "Invalid RGB values"
            );
        }

        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    void display() {
        System.out.println("Red : " + red);
        System.out.println("Green : " + green);
        System.out.println("Blue : " + blue);
    }
}

public class ColorDemo {
    public static void main(String[] args) {

        try {
            Color c = new Color(255, 100, 50);
            c.display();
        }
        catch (InvalidColorException e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}

