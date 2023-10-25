package chauhan.DSA.Greedy;

import java.util.Arrays;
import java.util.Comparator;

class knapSack {
    public static void main(String[]args){
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        double ratio[][] = new double[val.length][2];
        //0th col => idx, 1st col => ratio

        for(int i=0; i<val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        //ascending order sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); //lambda function o -> o[1]

        int capacity = W;
        double value = 0;

        for(int i=ratio.length-1; i>=0; i--) {
            int idx = (int)ratio[i][0];
            if(capacity>=weight[idx]) {
                capacity -= weight[idx];
                value += val[idx];
            } else {
                value += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }

        System.out.println("max total value = " + value);
    }
}