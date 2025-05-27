# Squares of a Sorted Array ([LeetCode Link](https://leetcode.com/problems/squares-of-a-sorted-array/))

## Approach: Two Pointers
- **Idea:** Use two pointers from both ends of the array to compare squares and build the result array from back to front.
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int pos = n - 1;
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                result[pos--] = leftSquare;
                left++;
            } else {
                result[pos--] = rightSquare;
                right--;
            }
        }
        return result;
    }
}
```
