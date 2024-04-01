class Solution {
    public int maxProfit(int[] prices) 
    {
        int minValue = Integer.MAX_VALUE;;
        int maxProfit = 0;
        int n = prices.length;

        for(int i=0; i<n; i++)
        {
            minValue = Math.min(minValue,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i] - minValue);
        }

        return maxProfit;
        
    }
}
