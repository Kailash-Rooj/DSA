// Sum of first N Natural Numbers
import java.util.*;

public class p02 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        n = sc.nextInt();
        System.out.println("SUM: " + fn(n));
    }
    
    public static int fn(int n){
        if(n < 1)return 0;
        return n + fn(n - 1);
    }
}

