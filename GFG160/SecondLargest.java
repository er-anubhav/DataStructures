class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int max = -1;
        int secmax = -1;
        for (int i = 0; i < n; i++){
            if(arr[i] > max){
                secmax = max;
                max = arr[i];
            }
            else if(arr[i] < max && arr[i] > secmax){
                secmax = arr[i];
            }
        }
        return secmax;
    }
}