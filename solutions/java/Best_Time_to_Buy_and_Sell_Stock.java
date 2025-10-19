class Solution {
    public int maxProfit(int[] prices) {
        int minPrice =Integer.MAX_VALUE;
        int maxPro = 0;
        for(int i=0;i<prices.length;i++){
            maxPro = Math.max(prices[i]-minPrice,maxPro);
            minPrice = Math.min(prices[i],minPrice);
        }
        return maxPro;
    }
}