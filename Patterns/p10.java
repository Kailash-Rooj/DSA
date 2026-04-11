import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        n = sc.nextInt();
        
        // Logic
        for (int i = 1; i <= 2*n - 1; i++) {
            int stars = i;
            if(i > 5){
                stars = 2*n - i;
            }
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
