package chauhan.DSA.MathsForDsa;

public class Xor {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int ans=0;
        System.out.println(XorOfAllNosFromAToB(a,b));

        //for loop just for verification purpose ,for large no.s it will give TLE
        for(int i=a;i<=b;i++){
            ans^=i;
        }
        System.out.println(ans);
    }

    static int XorOfAllNosFromAToB(int a,int b) {
        return XorFrom0TillN(b)^XorFrom0TillN(a-1);
    }

    static int XorFrom0TillN(int n) {
        if(n%4==0) {
            return n;
        }
        else if(n%4==1)
            return 1;
        else if(n%4==2)
            return n+1;

        return 0;
    }
}
