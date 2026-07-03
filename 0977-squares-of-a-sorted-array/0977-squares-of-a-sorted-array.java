class Solution {
//     public static void reverse(int[] array) {
//     int start = 0;
//     int end = array.length - 1;
    
//     while (start < end) {
//         int temp = array[start];
//         array[start] = array[end];
//         array[end] = temp;
//         start++;
//         end--;
//     }
// }
//     public static int[] square(int[] nums) {
//     int[nums = new int[nums.length];
//     for (int i = 0; i < nums.length; i++) {
//       nums[i] = nums[i] * nums[i];
//     }
//     returnums;
// }
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left= 0 , right = n-1;
        int k = n-1;
        //int[nums = square(nums);
        int[] ans = new int[n];
        while(left<=right){
          if(nums[left]*nums[left] > nums[right]*nums[right]){
          ans[k--] =  nums[left]*nums[left];
          left++;
            }
        else {
            ans[k--] = nums[right]*nums[right];
            right--;
            }
        }
        return ans;
    }
}