import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        // Instance for random class to generate random numbers
        Random random = new Random();
        //Instance for scanner class to take input from user
        Scanner scan = new Scanner(System.in);

        System.out.println("Computer has selected a random number between 1 and 100.");

        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        System.out.println("The number to guess is: " + numberToGuess); // For testing purposes, you can remove this line in production
        int numberOfTries = 0;

        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            // Here you would typically get user input, but for this example, we'll simulate guesses
            System.out.print("Enter your guess: ");
            int userGuess = scan.nextInt(); // Get user input
            numberOfTries++;

            if (userGuess < numberToGuess) {
                System.out.println("Your guess of " + userGuess + " is too low.");
            } 
            else if (userGuess > numberToGuess) {
                System.out.println("Your guess of " + userGuess + " is too high.");
            } 
            else {

                hasGuessedCorrectly = true;
    
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + numberOfTries + " tries.");
                int score =10-numberOfTries;
                System.out.println("Your score is: " + score);
                if(score < 0){
                    System.out.println("Your score is 0/10.");
                }
                else if(score == 9){
                    System.out.println("You have won the game and your score is 10/10.");
                }
                else{
                    System.out.println("Your score is " + score+ "/10.");
                }   
                break;

            }
        }

        scan.close();
    }
}