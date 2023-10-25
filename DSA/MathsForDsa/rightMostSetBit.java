package chauhan.DSA.MathsForDsa;

public class rightMostSetBit {
    public static void main(String[] args) {
        int n = 128;
        //best solution for position is n&-n but it is not working for no.s that are just simply power of 2,
        //i.e. in binary form having one 1 only.
        System.out.println(n&(-n));
        int position = 1;
        while(n>0) {
            if((n&1)== 1)
                break;
            position++;
            n = n>>1;
        }

        System.out.println("position of right most set bit = "+position);

    }
}
