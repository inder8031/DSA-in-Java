package chauhan.DSA.Sorting;

import java.util.Arrays;

public class mergeSort {
    static void mergeSortInPlace(int[] arr,int s,int e){
        if(e-s==1)
            return;

        int mid = s+(e-s)/2;

        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e-s];
        int i=s, j=m, k=0;

        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<m){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        System.arraycopy(mix,0,arr,s+0,mix.length);
    }

    public static int[] ms(int[] arr){
        if(arr.length==1)
            return arr;

        int mid = arr.length/2;

        int[] left = ms(Arrays.copyOfRange(arr,0,mid));
        int[] right = ms(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);

    }

    private static int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length+second.length];

        int i=0,j=0,k=0;

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
               mix[k] = first[i];
               i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        //mergeSortInPlace(arr,0,arr.length);
        arr = ms(arr);
        System.out.print(Arrays.toString(arr));
    }
}
