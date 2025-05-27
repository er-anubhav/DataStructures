# Best Time to Buy and Sell Stock II ([LeetCode Link](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/))

## Approach: Greedy
- **Idea:** Capture every profitable transaction by buying on a day and selling on the next day if there's a profit.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

```java
class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                totalProfit = totalProfit + prices[i] - prices[i - 1];
            }
        }
        return totalProfit;
    }
}
```