import java.util.Scanner;

public class p6 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        n = sc.nextInt();
        
        // Logic
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}