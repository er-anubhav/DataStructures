# Best Time to Buy and Sell Stock ([LeetCode Link](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/))

## Approach: Single Pass
- **Idea:** Track the minimum price so far and calculate the maximum profit at each step.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

```java
class Solution {
    public static int buysellstocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public int maxProfit(int[] prices) {
        return buysellstocks(prices);
    }
}
```