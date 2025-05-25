# Merge Sorted Array ([LeetCode Link](https://leetcode.com/problems/merge-sorted-array/))

## Approach: Two Pointers (from the end)
- **Idea:** Start merging from the end of `nums1` to avoid overwriting values. Place the largest of the two current elements at the end, and move pointers accordingly.
- **Time Complexity:** O(m + n)
- **Space Complexity:** O(1)

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m-1;
        int index2 = n-1;
        int mergeindex = m+n-1;
        while(index1>=0 && index2>=0){
            if(nums1[index1]>nums2[index2]){
                nums1[mergeindex]=nums1[index1];
                index1--;
            } else{
                nums1[mergeindex]=nums2[index2];
                index2--;
            }
            mergeindex--;
        }
        while(index2>=0){
            nums1[mergeindex]=nums2[index2];
            index2--;
            mergeindex--;
        }
    }
}
```