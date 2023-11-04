package chauhan.DSA.Greedy;

import java.util.Arrays;
import java.util.Collections;

class chocola {
    public static void main(String[] args) {
        Integer[] horCost = {4,1,2};
        Integer[] vertCost = {2,1,3,1,4};

        int minCost = minCutCost(horCost, vertCost);

        System.out.println("minimum cost to cut chocolate into single pieces = " + minCost);
    }

    static int minCutCost(Integer[] hor, Integer[] vert) {
        Arrays.sort(hor, Collections.reverseOrder());
        Arrays.sort(vert, Collections.reverseOrder());

        int h=0, v=0, hp=1, vp=1;
        int cost = 0;

        while(h<hor.length && v<vert.length) {
            if(hor[h] < vert[v]) {
                //vertical cut
                cost += vert[v]*hp;
                vp++;
                v++;
            } else {
                //horizontal cut
                cost += hor[h]*vp;
                hp++;
                h++;
            }
        }

        while(h<hor.length) {
            cost += hor[h]*vp;
            hp++;
            h++;
        }

        while(v<vert.length) {
            cost += vert[v]*hp;
            vp++;
            v++;
        }

        return cost;
    }
}