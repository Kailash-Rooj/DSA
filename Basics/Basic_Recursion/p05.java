// Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.
import java.util.*;

public class p05 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        n = sc.nextInt();

        for(int i = 0; i <= n; i++){
            System.out.print(fn(i) + " ");
        }
    }

    public static int fn(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fn(n-2) + fn(n-1);
    }
}