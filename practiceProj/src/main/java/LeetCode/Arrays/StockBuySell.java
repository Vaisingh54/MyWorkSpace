package LeetCode.Arrays;

public class StockBuySell {

    public static void main(String[] args) {

        int[] arr = { 7, 6, 5, 4, 3, 2 };
        System.out.println(maxProfit(arr));

    }

    static int maxProfit(int[] prices) {

        int size = prices.length;
        int least = Integer.MAX_VALUE;
        int finPro = 0;
        int profit = 0;
        for (int buy = 0; buy < size; buy++) {

            if (prices[buy] < least) {
                least = prices[buy];
            }

            profit = prices[buy] - least;

            if (profit > finPro) {
                finPro = profit;
            }

        }
        return finPro;

    }

}
