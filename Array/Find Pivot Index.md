# Find Pivot Index ([LeetCode Link](https://leetcode.com/problems/find-pivot-index/))

## Approach: Prefix Sum
- **Idea:** Calculate the total sum, then iterate through each element and check if sum to the left equals sum to the right.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

```java
class Solution {
    public int pivotIndex(int[] nums) {
        int sumLeft = 0;
        int totalSum = 0;
        for(int num:nums){
            totalSum += num;
        }
        for(int i = 0; i< nums.length; i++){
            int sumRight = totalSum - sumLeft - nums[i];
            if(sumLeft == sumRight){
                return i;
            }
            sumLeft += nums[i];
        }
        return -1;
    }
}
```