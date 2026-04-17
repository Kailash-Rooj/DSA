/*Problem Statement: Given an integer N, return true 
if it is a palindrome else return false.*/

import java.util.Scanner;

public class p02 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        n = sc.nextInt();
        
        if(fn(n)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");   
        }
    }

    public static boolean fn(int n){
        if((n < 0) || (n % 10 == 0 && n != 0))return false;
        int revNo = 0;
        while(n > revNo){
            revNo = (n % 10) + (revNo * 10);
            n /= 10;
        }
        return (revNo == n) || (revNo/10 == n);
    }

}