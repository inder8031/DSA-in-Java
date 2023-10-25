package chauhan.DSA.recursion;

public class level1Questions {
    public static void main(String[] args) {
        //System.out.println(factorial(5));
        revNum(1234);

    }

    static int factorial(int n) {
        if(n==1)
            return 1;
        return n*factorial(n-1);
    }

    static void revNum(int n) {
        if(n==0)
            return;  //1234

        System.out.print(n%10);
        revNum(n/10);

    }
}
