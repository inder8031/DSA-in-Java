package chauhan.DSA.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void mostFrequentElement(int[] arr){
        Map<Integer,Integer> mp = new HashMap<>();
        int maxFreq = -1;
        int maxFreqKey = -1;
        for(var key: arr)
            mp.put(key,mp.getOrDefault(key,0)+1);

        /*for(Map.Entry en: mp.entrySet()) {
            if((int)en.getValue()>maxFreq){
                maxFreq = (int)en.getValue();
                maxFreqKey = (int)en.getKey();
            }
        }*/

//without externally typecasting
        for(var en: mp.entrySet()) {
            if(en.getValue()>maxFreq){
                maxFreq = en.getValue();
                maxFreqKey = en.getKey();
            }
        }

        //Another way of traversing the map
       /* for(var key: mp.keySet()) {
            if(mp.get(key)>maxFreq) {
                maxFreq = mp.get(key);
                maxFreqKey = key;
            }
        }*/

        System.out.printf("maximum frequency element in the array is %d with frequency %d",maxFreqKey,maxFreq);

    }

    public static void main(String[] args) {
        mostFrequentElement(new int[]{1,3,2,1,4,1});
    }
}
