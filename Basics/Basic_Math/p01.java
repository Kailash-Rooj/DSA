// Problem Statement: Given an integer N return the reverse of the given number.

import java.util.Scanner;


public class p01 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        n = sc.nextInt();
        System.out.println("After reversing: " + fn(n));
    }

    public static int fn(int n){
        int flag = (n < 0) ? 1 : 0; // 1 = -ve
        n = Math.abs(n);
        int revNo = 0;
        while(n > 0){
            revNo = (n % 10) + (revNo * 10);
            n /= 10;
        }
        return (flag == 1)?-revNo:revNo;
    }

}