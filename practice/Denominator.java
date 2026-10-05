package practice;

public class Denominator {

    public static int findMinNotes(int amount, int[] denominations) {

        int minNotes = 0;

        for (int denomination : denominations) {

            int notes = amount / denomination;

            minNotes = minNotes + notes;

            amount = amount % denomination;
        }

        return minNotes;
    }

    public static void main(String[] args) {

        int amount = 1868;

        int[] denominations = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        int result = findMinNotes(amount, denominations);

        System.out.println("Minimum number of notes: " + result);
    }
}