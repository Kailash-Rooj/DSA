// Print 1 to N using Recursion
import java.util.*;

public class p01 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        n = sc.nextInt();
        fn(n);
    }
    
    public static void fn(int n){
        if(n < 1)return;
        fn(n - 1);
        System.out.println(n);
    }

}