class Solution {
    public static void reverse(int[] array) {
    int start = 0;
    int end = array.length - 1;
    
    while (start < end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        start++;
        end--;
    }
}
    public static int[] square(int[] nums) {
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        result[i] = nums[i] * nums[i];
    }
    return result;
}
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left= 0 , right = n-1;
        int k = 0;
        int[] result = square(nums);
        int[] ans = new int[n];
        while(left<=right){
          if(result[left] > result[right]){
          ans[k++] = result[left];
          left++;
            }
        else {
            ans[k++] = result[right];
            right--;
            }
        }
        reverse(ans);
        return ans;
    }
}