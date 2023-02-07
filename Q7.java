package Sibunsirpractice;
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for which you want to find the multiplication table: ");
        int num = sc.nextInt();
        System.out.println("The multiplication table of " + num + " is:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + num * i);
        }
    }
}
