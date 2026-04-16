// Problem Statement: Given an integer N, check whether it is prime or not. 

import java.util.Scanner;

public class p03 {
    public static void main(String[] args){
        int n , count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        n = sc.nextInt();
        
        if(fn(n)){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");   
        }
    }
    // Time: O(√N)  Space: O(1)
    public static boolean fn(int n){
        if(n < 2)return false;
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0)return false;
        }
        return true;
    }
}

