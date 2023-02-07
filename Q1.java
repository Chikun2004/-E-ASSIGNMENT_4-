package Sibunsirpractice;
import java.util .*;
    public class Q1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a, b, c, sum = 0;
            System.out.print("Enter first number: ");
            a = sc.nextInt();
            System.out.print("\nEnter second number: ");
            b = sc.nextInt();
            System.out.println("\nEnter third number: ");
            c = sc.nextInt();
            for (int i = a; i <= b; i += c) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.println("\n" + "\nThe sum of number displayed is " + sum);
        }
    }

