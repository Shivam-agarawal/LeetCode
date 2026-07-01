class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n];
        k = k%n;
        int j = 0;
        for(int i=n-k; i<n; i++){
             ans[j++] = arr[i];  
        }
        for(int i=0; i<n-k; i++){
            ans[j++] = arr[i];
        }
        for(int i = 0; i < n; i++){
        arr[i] = ans[i];
        }
    }
}