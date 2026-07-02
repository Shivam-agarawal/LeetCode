class Solution {
    public void swap(int[] arr, int slow, int fast){
        int temp = arr[slow];
        arr[slow] = arr[fast];
        arr[fast] = temp;
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int slow = 0, fast = 0;
        while(fast<n){
            if(nums[fast] != 0){
                swap(nums, slow, fast);
                slow++;
            }
            fast++;
            }
        }
    }
