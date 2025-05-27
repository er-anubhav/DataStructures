# Fibonacci Number ([LeetCode Link](https://leetcode.com/problems/fibonacci-number/))

## Approach: Iterative
- **Idea:** Calculate Fibonacci numbers iteratively using two variables to track previous values.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

```java
class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int firstterm = 0;
        int secondterm = 1;
        for(int i=1; i<=n; i++){
            int thirdterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = thirdterm;
        }
        return firstterm;
    }
}
```