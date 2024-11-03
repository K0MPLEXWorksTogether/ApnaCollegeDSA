public class BestTimeToBuyAndSellStock {
    public static int minPrice(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            buyPrice = Math.min(buyPrice, prices[i]);
            profit = Math.max(profit, prices[i] - buyPrice);
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] sample = {7, 1, 5, 3, 6, 4};
        System.out.println(minPrice(sample));
    }
}
