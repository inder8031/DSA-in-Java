package chauhan.DSA.Sorting;

import java.util.Arrays;

public class bubbleSort {
    static  int[] bubble(int[] arr) {
        boolean sorted;
        for(int i=0;i<arr.length-1;i++){
            sorted = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    sorted = true;
                }
            }
            if(!sorted)
                break;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,-3,2,1,0,-5};
        bubble(arr);
        System.out.print(Arrays.toString(arr));
    }
}
