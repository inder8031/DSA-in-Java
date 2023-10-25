package chauhan.DSA.recursion;

public class bs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,56,66,78};
        int target = 56;
        System.out.println(target+" in arr is present at index = "+search(arr,target,0,arr.length-1));
    }

    static int search(int[] arr,int target,int s,int e) {
        if(s>e)
            return -1;

        int mid = s + (e-s)/2;
        if(arr[mid]==target) {
            return mid;
        }

        if(arr[mid]<target) {
            return search(arr,target,mid+1,e);
        }
        else
            return search(arr,target,s,mid-1);

    }
}
