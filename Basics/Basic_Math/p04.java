// Problem Statement: Print all Divisors of a given Number
import java.util.*;

public class p04 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        n = sc.nextInt();
        
        System.out.println(fn(n));
    }

    public static List<Integer> fn(int n){
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i*i <= n; i++){
            if(n % i == 0){
                res.add(i);

                if(i != n/i)
                    res.add(n/i);
            }
        }
        Collections.sort(res); /* I did it to get sorted output , it is not needed if output order doesnot matter*/
        return res;
    }
}

