package chauhan.DSA.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class maxLenChainOfPairs {
    public static void main(String[] args) {
        int[][] pairs = {
                {5, 24},
                {39, 60},
                {5, 28},
                {27, 40},
                {50, 90}
        };

        int ans = 1;
        ArrayList<ArrayList<Integer>> selectedChain = new ArrayList<>();

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        selectedChain.add(new ArrayList(Arrays.asList(pairs[0][0], pairs[0][1])));
        int chainEnd = pairs[0][1];

        for(int i=1; i<pairs.length; i++) {
            if(pairs[i][0] > chainEnd) {
                ans++;
                selectedChain.add(new ArrayList(Arrays.asList(pairs[i][0], pairs[i][1])));
                chainEnd = pairs[i][1];
            }
        }

        System.out.println("maximum chain length of pairs = " + ans);
        System.out.println("These chain is as follows");
        for(int i=0; i<selectedChain.size(); i++) {
            System.out.print("(" + selectedChain.get(i).get(0) + ", " + selectedChain.get(i).get(1) + ")" + " -> ");
        }

        System.out.println("end");
    }
}