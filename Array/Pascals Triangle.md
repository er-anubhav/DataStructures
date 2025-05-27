# Pascal's Triangle ([LeetCode Link](https://leetcode.com/problems/pascals-triangle/))

## Approach: Dynamic Programming
- **Idea:** Build each row using values from the previous row, where each cell equals the sum of the two cells above it.
- **Time Complexity:** O(n²)
- **Space Complexity:** O(n²)

```java
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int rowNum = 0; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= rowNum; j++) {
                if (j == 0 || j == rowNum) {
                    row.add(1);
                } else {
                    int left = triangle.get(rowNum - 1).get(j - 1);
                    int right = triangle.get(rowNum - 1).get(j);
                    row.add(left + right);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }
}
```
