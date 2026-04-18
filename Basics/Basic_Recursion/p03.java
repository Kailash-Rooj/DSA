// Factorial of a Number
import java.util.*;

public class p03 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        n = sc.nextInt();
        System.out.println("Factorial: " + fn(n));
    }
    
    public static int fn(int n){
        if(n == 0 || n == 1)return 1;
        return n * fn(n - 1);
    }
}