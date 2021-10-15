package recursion;
import java.util.*;

public class fibonacci {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter nth number : ");
        int n = s.nextInt();
        System.out.println(rec_fib(n));

    }

    public static int rec_fib(int n) {
        if(n <= 1) return n;
        int fib = rec_fib(n-1)+ rec_fib(n-2);
        return fib;

    }
}
