class Solution {
    public int[] runningSum(int[] num) {
        int n = num.length;
        for(int i=1; i<n; i++){
        num[i] = num[i-1] + num[i];
        }
        return num;
    }
}