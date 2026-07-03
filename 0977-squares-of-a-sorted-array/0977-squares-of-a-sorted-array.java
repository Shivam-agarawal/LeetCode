class Solution {
    public static int[] square(int[] nums) {
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        result[i] = nums[i] * nums[i];
    }
    return result;
}
    public int[] sortedSquares(int[] nums) {
        // int n = nums.length;
        // int left= 0 , right = n-1;
        int[] result = square(nums);
        // while(left<right){
            
        // }
        Arrays.sort(result);
        return result;
    }
}