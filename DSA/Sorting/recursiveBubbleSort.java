package chauhan.DSA.Sorting;

import java.util.*;

public class recursiveBubbleSort {
    static void recBubble(int[] arr,int row,int col){
        if(row<=0)
            return;

        if(col<row){
            if(arr[col]>arr[col+1]){
                swap(arr,col,col+1);
            }
            recBubble(arr,row,col+1);
        }

        recBubble(arr,row-1,0);
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,5,4};
        int[] arr1 = {1,1,2,1,2,7,4,2};
        recBubble(arr1,arr1.length-1,0);
        System.out.println(Arrays.toString(arr1));
    }
}
