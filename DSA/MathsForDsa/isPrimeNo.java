package chauhan.DSA.MathsForDsa;

import static java.lang.Math.sqrt;
import java.util.*;

public class isPrimeNo {
    public static void main(String[] args) {
        int n = 100;
        returnAllPrimeTillN(n);
    }

    private static void returnAllPrimeTillN(int n) {
        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, true);
        for (int i = 2; i <= sqrt(n); i++) {
            if (!isPrime(i)) {
                arr[i] = false;
                continue;
            }
            for (int j = 2; j <= n / i; j++) {
                arr[i * j] = false;
            }
        }

        for (int k = 2; k <= n; k++) {
            if (arr[k] == true) {
                System.out.print(k + "  ");
            }
        }


    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}