package chauhan.DSA.Greedy;

import java.util.Arrays;

class minAbsDiffPair {
    public static void main(String[] args) {
        int[] a = {4, 1, 8, 7};
        int[] b = {2, 3 ,6, 5};

        Arrays.sort(a);
        Arrays.sort(b);

        int minSum = 0;

        for(int i=0; i<a.length; i++) {
            minSum += Math.abs(a[i] - b[i]);
        }

        System.out.println("Minimum Absolute differences of all the pairs is = " + minSum);
    }
}