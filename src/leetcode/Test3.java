package leetcode;

public class Test3 {
  public static void main(String[] args) {
    int[] prices = {3,3,5,0,0,3,1,4};
    System.out.println(maxProfit(prices));
  }
  public  static int maxProfit(int[] prices) {
    int minBuy=prices[0];
    int sumMaxProfit=0;
    int startIndex=0;
    for(int j=0;j<2;j++){
      int maxProfit=0;
      int index=0;
      for(int i= startIndex;i<prices.length;i++){

        minBuy=Math.min(minBuy,prices[i]);
        int profit=prices[i]-minBuy;
        maxProfit=Math.max(maxProfit,profit);
        index=i;

      }
      sumMaxProfit=sumMaxProfit+maxProfit;
      if(prices.length==index+1){
        return sumMaxProfit;
      }else{
        startIndex=index;
        minBuy=prices[index+1];
      }

    }
    return sumMaxProfit;
  }
}
