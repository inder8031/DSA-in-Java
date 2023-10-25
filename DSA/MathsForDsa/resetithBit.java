package chauhan.DSA.MathsForDsa;

public class resetithBit {
    public static void main(String[] args) {
        int n = 86;
        int pos = 5;
        int m = ~(int)Math.pow(2,pos-1);
        System.out.println(n&m);
    }
}
