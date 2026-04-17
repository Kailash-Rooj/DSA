// Problem Statement: Given an integer N, print the number of digits in N.
import java.util.Scanner;


public class p00 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        n = sc.nextInt();
        System.out.println("Number of digits = " + fn1(n));
        System.out.println("Number of digits = " + fn2(n));
    }

    // Time: O(log10 N)  |  Space: O(1)
    public static int fn1(int n){
        int count = 0;
        if(n == 0) return 1;
        n = Math.abs(n);

        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    //Mathematical approach (log10) 
    // Time: O(1)  |  Space: O(1)
    public static int fn2(int n){
        if(n == 0)return 1;
        n = Math.abs(n);
        return 1 + (int)Math.log10(n);
    }
}