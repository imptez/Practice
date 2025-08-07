package Job;

public class MaxProfitFinder {
    public static void main(String[] args) {
        int money = 20;
        int[] prices = {18, 23, 230, 24, 35, 80, 70, 18, 29, 150, 8, 155, 17};

        Stock stockPrice = getMaximumStockProfit(money, prices);
        System.out.println(stockPrice);
    }

    private static Stock getMaximumStockProfit(int money, int[] prices) {
        int maxProfit=0;
        int bestBuy=-1;
        int bestSel=-1;

        int minPrice=Integer.MAX_VALUE;
        for(int price:prices){
            if(price<=money && price<minPrice){
                minPrice=price;
            } else if (minPrice <= money) {
                int profit=price - money;
                if(profit>maxProfit){
                    maxProfit=profit;
                    bestBuy=minPrice;
                    bestSel=price;
                }
            }
        }
        return new Stock(bestBuy,bestSel,maxProfit);
    }















   /* private static Stock getMaximumStockProfit(int money, int[] prices) {

        int maxProfit = 0;
        int bestBuy = -1;
        int bestSell = -1;

        int minPrice = Integer.MAX_VALUE;
        System.out.println("the min price is "+minPrice);
        for (int price : prices) {
            if (price <= money && price < minPrice) {
                minPrice = price;
            } else if (minPrice <= money) {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                    bestBuy = minPrice;
                    bestSell = price;
                }
            }
        }
        return new Stock(bestBuy, bestSell,maxProfit);
    }
*/

    public static class Stock {
        private int buyPrice;
        private int sellPrice;
        private int profit;

        public Stock(int buyPrice, int sellPrice, int profit) {
            this.buyPrice = buyPrice;
            this.sellPrice = sellPrice;
            this.profit = profit;
        }

        public int getBuyPrice() {
            return buyPrice;
        }

        public int getProfit() {
            return profit;
        }

        public int getSellPrice() {
            return sellPrice;
        }

        @Override
        public String toString() {
            return "Stock{" +
                    "buyPrice=" + buyPrice +
                    ", sellPrice=" + sellPrice +
                    ", profit=" + profit +
                    '}';
        }
    }

}
