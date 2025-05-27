# Remove Duplicates from Sorted Array ([LeetCode Link](https://leetcode.com/problems/remove-duplicates-from-sorted-array/))

## Approach: HashSet
- **Idea:** Use a HashSet to track unique elements and build the result in-place.
- **Time Complexity:** O(n)
- **Space Complexity:** O(n) - due to the HashSet

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        int idx = 0;  
        for (int i = 0; i < nums.length; i++) {
            if (!s.contains(nums[i])) { 
                s.add(nums[i]);  
                nums[idx++] = nums[i];  
            }
        }
        return idx;
    }
}
```