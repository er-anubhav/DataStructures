# Two Sum ([LeetCode Link](https://leetcode.com/problems/two-sum/))

## Approach: HashMap
- **Idea:** Store each number's index as you iterate. For each number, check if its complement (target - number) exists in the map.
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value -> index
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (map.containsKey(remaining)) {
                return new int[] { map.get(remaining), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
```

