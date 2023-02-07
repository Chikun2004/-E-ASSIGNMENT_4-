package Sibunsirpractice;
import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();
        String str = Integer.toString(num);
        str = str.replace("0", "");
        int newNum = Integer.parseInt(str);
        System.out.println("After removing 0 from number " + num + ", the new number is " + newNum);
    }
}
