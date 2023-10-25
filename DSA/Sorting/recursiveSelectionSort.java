package chauhan.DSA.Sorting;

import java.util.*;

public class recursiveSelectionSort {
    static void recSelection(int[] arr,int lastI,int index){
        if(lastI<=0)
            return;

        int maxIndex = getMaxIndex(arr,lastI,index,0);

        swap(arr,lastI,maxIndex);
        recSelection(arr,lastI-1,0);
    }

    static int getMaxIndex(int[] arr,int lastI,int index,int maxIndex){
        if(index>lastI)
            return maxIndex;

        int max = maxIndex;

        if(arr[index]>arr[maxIndex]){
           max = getMaxIndex(arr,lastI,index+1,index);
        }
        else
           max = getMaxIndex(arr,lastI,index+1,maxIndex);

        return max;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {-1,-2,-4,0,-5};
        int[] arr1 = {5,5,1,2,4,7,2,-4,-2};
        recSelection(arr1,arr1.length-1,1); //index starting from 1 as in getMaxIndex function maxIndex is starting from 0 so there is no point in comparing index 0 with maxIndex 0 at start of every getMaxIndex recursive function call.
        System.out.println(Arrays.toString(arr1));
    }

}
