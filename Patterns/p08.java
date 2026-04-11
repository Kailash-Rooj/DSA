import java.util.Scanner;

public class p08 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        n = sc.nextInt();
        
        // Logic
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*n-2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}