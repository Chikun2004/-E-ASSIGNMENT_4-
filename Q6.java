package Sibunsirpractice;
import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,r,count=0;
        System.out.println("Enter the base: ");
        n=sc.nextInt();
        System.out.println("Enter the power:");
        r=sc.nextInt();
        for (int i = 0; i <=r; i++){
            count=n*n;
        }System.out.println(count);
    }
}
