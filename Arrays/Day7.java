// Day 7 : Stock Buy and Sell – Multiple Transaction Allowed
// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/stock-buy-and-sell2615

public class Day7 {
    public static void main(String args[]) {
        int prices[] = {100, 180, 260, 310, 40, 535, 695};

    }

    public static int maximumProfit(int prices[]) {
        int maxProfit = 0;
        int buyPrices = prices[0];

        for(int i=0; i<prices.length; i++) {
            int currProfit = prices[i] - buyPrices;

            if(currProfit > maxProfit) {
                
            }
        }
    }
}