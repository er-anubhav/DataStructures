# Running Sum of 1d Array ([LeetCode Link](https://leetcode.com/problems/running-sum-of-1d-array/))

## Approach: In-place Modification
- **Idea:** Iterate through the array and make each element the sum of itself and all previous elements.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1) - modifies the input array

```java
class Solution {
    public int[] runningSum(int[] nums) {
        for (int index = 1; index < nums.length; index++) {
            nums[index] += nums[index - 1];
        }
        return nums;
    }
}
```