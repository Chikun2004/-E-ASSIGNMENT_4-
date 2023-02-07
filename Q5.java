package Sibunsirpractice;
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        System.out.print("0");
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
                System.out.print(" + "+sum);
            }
        }
        if (sum == num) {
            System.out.println("\n"+num + " is a perfect number.");
        } else {
            System.out.println("\n"+num + " is not a perfect number.");
        }
    }
}
