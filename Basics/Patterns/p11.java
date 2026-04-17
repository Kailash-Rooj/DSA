import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        n = sc.nextInt();
        
        // Logic
        for (int i = 1; i <= n; i++) {
            int temp = 1;;
            if(i % 2 == 0){
                temp = 0;
            }
            for(int j = 1; j <= i; j++){
                System.out.print(temp);
                temp = 1 - temp;
            }
            System.out.println();
        }
    }
}
