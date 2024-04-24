class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int lowest_price = prices[0];
        for(int i=1;i<prices.length;i++){
            if((prices[i] - lowest_price) > max_profit){
                max_profit = (prices[i] - lowest_price);
            }
            if(prices[i] < lowest_price){
                lowest_price = prices[i];
            }
        }
        return max_profit;
    }
}
