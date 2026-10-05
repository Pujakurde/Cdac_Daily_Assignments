package palindrome;

public class Palindrome {

    public static boolean palindromeString(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return palindromeString(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String s = "heeh";

        System.out.println(
            "Is palindrome: " +
            palindromeString(s, 0, s.length() - 1)
        );
    }
}