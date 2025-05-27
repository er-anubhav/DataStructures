# Majority Element ([LeetCode Link](https://leetcode.com/problems/majority-element/))

## Approach: Boyer-Moore Voting Algorithm
- **Idea:** Find a majority element that appears more than n/2 times using a counter approach.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

```java
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else {
                if (num == candidate) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        
        return candidate;
    }
}
```