package chauhan.DSA.MathsForDsa;

public class setithBit {
    public static void main(String[] args) {
        int n = 8;
        int pos = 3;
        int m = (int)Math.pow(2,pos-1);
        System.out.println(n|m);
    }
}

