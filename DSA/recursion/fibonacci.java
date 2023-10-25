package chauhan.DSA.recursion;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter value of n: ");
        int n=in.nextInt();
        System.out.println(n+"th term of fibonacci series is ");
        fib(n);
    }

    static int fib(int n) {
        if(n<2)
            return n;

        return fib(n-1) + fib(n-2);
    }
}
