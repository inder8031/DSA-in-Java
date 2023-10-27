package chauhan.DSA.Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Scanner;

class IndianCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        System.out.print("Enter your amount here: ");
        int amount = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++) {
            if (coins[i] <= amount) {
//                while(coins[i] <= amount) {
//                    countOfCoins++;
//                    amount -= coins[i];
//            }
                countOfCoins += amount / coins[i];
                for(int j=0; j<amount/coins[i] ; j++){
                    ans.add(coins[i]);
                }
                amount %= coins[i];
            }
            if (amount == 0) {
                break;
            }
        }
        System.out.println("total no. of coins = "+countOfCoins);

        for(int i=0; i<ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}