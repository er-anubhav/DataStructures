# Move Zeroes ([LeetCode Link](https://leetcode.com/problems/move-zeroes/))

## Approach: Two Pointers
- **Idea:** Find the first zero, then swap non-zero elements with zeros as we iterate through the array.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) return;
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
```
