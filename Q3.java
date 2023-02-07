package Sibunsirpractice;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,r,count=0;
        System.out.println("Enter the number ");
        n=sc.nextInt();
        int sum=0,div=0;
        System.out.print("The randomly generated number are ");
        do{
            r= 1+((int)((Math.random())*((n-1)+1)));
            count=count+r;
            System.out.print( r+" ");
            sum++;

        }
        while(sum<=n-1);
        int avrage=count/n;
        System.out.println("\nAvrage of "+n+" numbers are "+avrage);




    }
}


