import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(100)+1;
        int attempts = 0;
        int guess;
        System.out.println("Guess the Number (1–100)");
        while (true){
            System.out.println("Enter Your Guess:");
            guess=sc.nextInt();
            attempts++;
            if(guess>num){
                System.out.println("Too High!");
            }
            else if(guess<num){
                System.out.println("Too Low!");
            }
            else {
                System.out.println("Congratulations! You guessed the number correctly.\nNumber: " + num + "\nAttempts: " + attempts);
                break;
            }
        }
    }
}
