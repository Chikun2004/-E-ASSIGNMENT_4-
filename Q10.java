package Sibunsirpractice;
import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int largestPower = 1;
        while (largestPower <= n) {
            largestPower *= 3;
        }
        largestPower /= 3;
        System.out.println("The largest power of 3 less than or equal to " + n + " is " + largestPower);
    }
}
