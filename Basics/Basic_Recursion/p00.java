// Print Name N times using Recursion

import java.util.*;


public class p00 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        n = sc.nextInt();
        System.out.print("Enter Name: ");
        String str = sc.next();
        fn(n , str);
    }
    
    public static void fn(int n , String str){
        if(n < 1)return;
        System.out.println(str);
        fn(n - 1 , str);
    }

}