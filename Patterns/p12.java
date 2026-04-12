import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        n = sc.nextInt();

        // Logic
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = n; j >= i+1; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            if (i > 1) {
                for(int j = i-1; j >= 1; j--){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
