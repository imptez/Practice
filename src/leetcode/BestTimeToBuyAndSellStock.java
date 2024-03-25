package leetcode;

import javax.imageio.ImageTranscoder;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int prices[] = {3, 1, 4, 8, 7, 2, 5,10};
        System.out.println(maxProfit1(prices));
    }

    public static int maxProfit(int[] prices) {
        int minBuy = prices[0], maxProfit = 0;
        for (int price : prices) {
            minBuy = Math.min(minBuy, price);
            int profit = price - minBuy;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }


//if (minBuy > prices[i]) {
//    minBuy = prices[i];
//    }
//    if (maxProfit < (prices[i] - minBuy)) {
//    maxProfit = prices[i] - minBuy;
//    day=i;
//    }

    public static int maxProfit1(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int price:prices){
          minPrice = Math.min(minPrice,price);
          int profit = price -minPrice;
          maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }


}


