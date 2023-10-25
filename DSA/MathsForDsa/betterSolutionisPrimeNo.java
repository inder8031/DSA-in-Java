package chauhan.DSA.MathsForDsa;

//Better solution as here we didn't need to change values of all elements of array to true from initial value false
//change multiple of prime nos.<= sqrt(n) to true in the array
//all elements of array that will be false at the end ,will be the prime nos.
//Sieve of Eratosthenes( method for finding prime no.s less than or equal to N )
public class betterSolutionisPrimeNo {
    public static void main(String[] args) {
        int n = 40;
        boolean[] arr = new boolean[n+1];
        returnAllPrimeNo(arr,n);
    }

    public static void returnAllPrimeNo(boolean[] arr, int n) {
        for(int i=2;i*i<=n;i++) {
            if(!arr[i]) {
                for(int j=i*i;j<=n;j+=i) {
                    arr[j] = true;
                }
            }
        }

        for(int i=2;i<=n;i++) {
            if(!arr[i])
                System.out.print(i+"  ");
        }
    }
}
