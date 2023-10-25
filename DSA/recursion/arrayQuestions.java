package chauhan.DSA.recursion;

public class arrayQuestions {

    public static void main(String[] args) {
        int[] arr = {1,2,4,3,8,9};
        System.out.println(arrSorted(arr));
        System.out.println(linearSearch(arr,1,0));
    }

    static boolean arrSorted(int[] arr) {
         return helper(arr,0);
    }

    private static boolean helper(int[] arr,int start) {
        if(start == arr.length-1)
            return true;

        return arr[start]<arr[start+1] && helper(arr,start+1);
    }

    static boolean linearSearch(int[] arr,int target,int index) {
        if(index>arr.length-1)
            return false;
        return arr[index]==target || linearSearch(arr,target,index+1);
    }
}
