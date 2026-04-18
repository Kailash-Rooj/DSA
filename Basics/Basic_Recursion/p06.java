import java.util.*;

public class p06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();

        if(fn(str , 0 , str.length()-1))
            System.out.println("Palindrome");
        else 
            System.out.println("Not Palindrome");
    }

    public static boolean fn(String str , int st , int end){
        if(st >= end) return true;
        if(str.charAt(st) != str.charAt(end)) return false;
        return fn(str, st + 1, end - 1);
    }
}