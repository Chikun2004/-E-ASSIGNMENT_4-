package Sibunsirpractice;
import java.util.*;
import java.lang.*;
public class Q8 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10) + 1; // generates a random number between 1 and 10
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Guess the number between 1 to 10: ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Good guess!");
                break;
            } else if (guess < number) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Too high, try again.");
            }
        }
    }
}
