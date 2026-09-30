public class Greater {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;

        String result =
            (num1 > num2 && num1 > num3)
                ? "Greatest number is num1"
                : (num2 > num3)
                    ? "Greatest number is num2"
                    : "Greatest number is num3";

        System.out.println(result);
    }
}