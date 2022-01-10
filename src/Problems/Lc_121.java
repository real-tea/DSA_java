package Problems;

public class Lc_121 {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int [] prices)
    {
        int maxProfit = 0;
        int minSoFar = prices[0];
        for (int i = 0; i < prices.length; i++) {
            minSoFar = Math.min(prices[i] , minSoFar);
            int Profit = prices[i] - minSoFar;
            maxProfit = Math.max(Profit , maxProfit );
        }
        return maxProfit;
    }
}
