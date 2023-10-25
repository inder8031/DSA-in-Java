package chauhan.DSA.MathsForDsa;

public class findithBit {
    public static void main(String[] args) {
        int n = 8;
        int pos = 32;
        int m = (int)Math.pow(2,pos-1);
       /* System.out.println(m);
        System.out.println(n&(m-1));*/
        if((n&m) == 0)
            System.out.println(pos+"th bit of "+n+" is zero(0)");
        else
            System.out.println(pos+"th bit of "+n+" is one(1)");
    }
}
