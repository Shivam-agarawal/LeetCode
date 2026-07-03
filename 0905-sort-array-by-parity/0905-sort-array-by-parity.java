class Solution {
    public void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int left = 0 , right = n-1;
        while(left<right){
            if(nums[left]%2 != 0 && nums[right]%2 == 0){
                swap(nums, left, right);
                left++;
                right--;
            }
            else if(nums[left]%2 == 0 ){
                left++;
            }
            else if(nums[right]%2 != 0){
                right--;
            }
        }
        return nums;
    }
}