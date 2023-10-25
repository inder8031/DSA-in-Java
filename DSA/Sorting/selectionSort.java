package chauhan.DSA.Sorting;

import java.util.Arrays;

public class selectionSort {
    static void selection(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            int last = arr.length-1-i;
            int maxIndex = getMaxIndex(arr,0, last);
            swap(arr,last, maxIndex);
        }
    }

    private static void swap(int[] arr,int last, int maxIndex) {
        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;
    }

    private static int getMaxIndex(int[] arr,int start, int last) {
        int max = arr[0];
        int index = 0;
        for(int i=0;i<=last;i++) {
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,-2,-10,0,9,-15};
        int[] arr1 = {5,4,3,2,1};
        selection(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}