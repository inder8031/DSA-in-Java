package chauhan.DSA.patterns;

import java.util.*;

public class pattern1 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class pattern2 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class pattern3 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class pattern4 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

class pattern5 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class pattern6 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class pattern7 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            for(int j=5;j>i;j--) {
                System.out.print(" ");
            }
            for(int k=1;k<i*2;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class pattern8_1 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<i;j++) {
                System.out.print(" ");
            }
            for(int k=5;k>i;k--) {
                System.out.print("*");
            }
            for(int l=5;l>=i;l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class pattern8_2 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--) {
            for(int j=5;j>i;j--) {
                System.out.print(" ");
            }
            for(int k=1;k<2*i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class pattern9 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            for(int j=5;j>i;j--) {
                System.out.print(" ");
            }
            for(int k=1;k<i*2;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l=5;l>=1;l--) {
            for(int j=5;j>l;j--) {
                System.out.print(" ");
            }
            for(int k=1;k<2*l;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class pattern10 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=1;k<5;k++) {
            for(int l=4;l>=k;l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class pattern11 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                if(i%2==1){
                    if(j%2==1)
                        System.out.print("1");
                    else
                        System.out.print("0");
                }
                else{
                    if(j%2==1)
                        System.out.print("0");
                    else {
                        System.out.print("1");
                    }
                }
            }
            System.out.println();
        }
    }
}

class pattern12 {
    public static void main(String[] args) {
        for(int i=1;i<5;i++) {
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=4;k>i;k--) {
                System.out.print("  ");
            }
            for(int l=i;l>=1;l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}

class pattern13 {
    public static void main(String[] args) {
        int k=1;
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}

class pattern14 {
    public static void main(String[] args) {
        for(char i='A';i<='E';i++) {
            for(char j='A';j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class pattern15 {
    public static void main(String[] args) {
        for(char i='E';i>='A';i--){
            for(char j='A';j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class pattern16 {
    public static void main(String[] args) {
        for(char i='A';i<='E';i++) {
            for(char j='A';j<=i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

class pattern17 {
    public static void main(String[] args) {
        for(char i='A';i<='D';i++) {
            for(char j='D';j>i;j--) {
                System.out.print(" ");
            }
            for(char k='A';k<i;k++) {
                System.out.print(k);
            }
            for(char l=i;l>='A';l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}

class pattern18 {
    public static void main(String[] args) {
        for(char i='E';i>='A';i--) {
            for(char j=i;j<='E';j++)
                System.out.print(j);
            System.out.println();
        }
    }
}

class pattern19 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            for(int j=5;j>=i;j--)
                System.out.print("*");
            for(int k=1;k<i;k++)
                System.out.print("  ");
            for(int l=5;l>=i;l--)
                System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            for(int k=5;k>i;k--)
                System.out.print("  ");
            for(int l=1;l<=i;l++)
                System.out.print("*");
            System.out.println();
        }
    }
}

class pattern20 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            for(int k=5;k>i;k--)
                System.out.print("  ");
            for(int l=1;l<=i;l++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<5;i++) {
            for(int j=5;j>i;j--)
                System.out.print("*");
            for(int k=1;k<=i*2;k++)     //k<=i
                System.out.print(" ");  //sout("  ")
            for(int l=5;l>i;l--)
                System.out.print("*");
            System.out.println();
        }
    }
}

class pattern21 {
    public static void main(String[] args) {
        /*for(int i=1;i<5;i++){
            if(i==1 || i==4)
                System.out.print("****");
            else
                System.out.print("*  *");
            System.out.println();
        }*/
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=4;j++){
                if(i==1 || i==4 || j==1 || j==4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class pattern22 {
    public static void main(String[] args) {
        for(int i=0;i<7;i++) {
            for(int j=0;j<7;j++) {
                int top=i;
                int bottom=6-i;
                int left=j;
                int right=6-j;
                int result=4-(Math.min(Math.min(top,bottom),Math.min(left,right)));
                System.out.print(result);
            }
            System.out.println();
        }
    }
}

class trial {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //revArray(arr);
        recursiveReverseArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void recursiveReverseArray(int[] arr, int si, int ei) {
        if(si>=ei)
            return;

        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;

        recursiveReverseArray(arr,si+1,ei-1);
    }

    private static void revArray(int[] arr) {
        int i = 0;
        int length = arr.length;
        while(i<length-1-i) {
            int temp = arr[i];
            arr[i] = arr[length-i-1];
            arr[length-1-i] = temp;
            i++;
        }
    }
}

class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome("ab"));
    }
   static int isPalindrome(String S) {
        // code here
        int i = 0;
        int length = S.length();
       /* while(i<length-1-i) {
            if(S.charAt(i)!=S.charAt(length-1-i))
            return 0;

            i++;
        }

        return 1;*/
        if(palindrome(S,i,length-1))
            return 1;
        else return 0;
    }

    static boolean palindrome(String s, int first, int last) {
        if(first>=last)
            return true;

        if(s.charAt(first)!=s.charAt(last))
            return false;

        return palindrome(s,first+1,last-1);
    }
};

class Solution1{
    static int minJumps(int[] arr){
        // your code here
        if(arr.length<=1)
            return 0;

        if(arr[0]==0)
            return -1;

        int maxReachableIndex = arr[0];
        int steps = arr[0];
        int jump = 1;

        for(int i=1; i<arr.length;i++) {
            if(i==arr.length-1)
                return jump;

            maxReachableIndex = Math.max(maxReachableIndex, i+arr[i]);

            steps--;

            if(steps==0) {
                jump++;

                if(i>=maxReachableIndex)
                    return -1;

                steps = maxReachableIndex-i;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,8,4,2,6,7,6,8,9};
        int[] arr1 = {1,4,3,2,6,7};
        System.out.println(minJumps(arr));
        System.out.println(minJumps(arr1));
    }
}

class Solution2{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        int[] count = new int[N];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>N)
                continue;
            count[arr[i]-1]++;
        }

        for(int i=0;i<count.length;i++){
            arr[i]=count[i];
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        frequencyCount(new int[]{3,2,2,2,1},5,3);

    }
}

class Solution3 {
    public int[] topK(int[] nums, int k) {
        // Code here
        int[] topElements = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        }

        List<Map.Entry<Integer, Integer> > list = new ArrayList<>(map.entrySet());

        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,Map.Entry<Integer, Integer> o2) {
                if(o1.getValue()==o2.getValue())
                    return o2.getKey()-o1.getKey();

                return o2.getValue()-o1.getValue();
            }
        });

        int[] array = new int[k];
          for(int i = 0;i<k;i++) {
            array[i] = list.get(i).getKey();
        }

        return array;

    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int[] arr1 = {1,1,2,2,4,3,3,3};
        Solution3 obj = new Solution3();
        System.out.println(Arrays.toString(obj.topK(arr,2)));
    }
}

class Solution4 {
    public static void stockBuySell(int[] price, int n) {
        // code here
        int bd=-1,sd=-1,p=0;
        for(int j=0;j<n-1;){
            if(price[j]<price[j+1]){
                bd = j;
                p=1;
            }
            else{ j++; continue;}
            for(int i=j+1;i<n;i++){
                if(price[i-1]>price[i]) {
                    sd = i - 1;
                    if (sd > bd) {
                        System.out.print("(" + bd + " " + sd + ") ");
                    }
                    j = i;
                    break;
                }
                if(i==n-1){
                    j=i;
                    break;
                }
            }
        }

        if(price[n-2]<price[n-1]){
            System.out.print("("+bd+" "+(n-1)+") ");
        }

        if(p==0){
            System.out.print("No Profit");
        }

        System.out.println("");
    }

    public static void main(String[] args) {
        int [] a = new int[]{100, 180, 260, 310, 40, 535, 695};
        int[] b = new int[]{4335,1257,3515,5056};
        stockBuySell(b,4);
    }
}

class Solution5 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = 0;
        while(n<numRows){
            List<Integer> list = new ArrayList<>();
            for(int r=0;r<=n;r++){
                list.add(factn(n,r));
            }
            ans.add(list);
            n++;
        }
        return ans;
    }

    static int fact(int n){
        int ans = 1;
        for(int i=2;i<=n;i++){
            ans*=i;
        }
        return ans;
    }

    static int factn(int n,int r){
        int ans = n;

        if(r==0 || r==n)
            return 1;

        int small = r>(n-r)?n-r:r;

        for(int i=1;i<small;i++){
            ans*=--n;
        }
        return ans/fact(small);
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = generate(4);
        for(List i: ans){
            System.out.println(i);
        }

    }
}

class Test
{
    public static void main(String[] args)
    {
        String s = "   TUF is great for interview   preparation  ";
        System.out.println("After reversing words: ");
        System.out.println(s);
        //s += " ";
        Stack<String> st = new Stack<String>();
        int i;
        String str = "";
        for (i = 0;i < s.length();i++)
        {
            if (s.charAt(i) == ' ')
            {
                st.push(str);
                str = "";
            }
            else
            {
                str += s.charAt(i);
            }
        }
        String ans = "";
        while (st.size() != 1)
        {
            if(st.peek()!=""){
                ans += st.peek() + " ";
            }
            st.pop();
        }
        ans += st.peek(); // The last word should'nt have a space after it
        System.out.println("After reversing words: ");
        System.out.print(ans);
    }
}




