class Solution {
    public void swap(int[] arr , int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = arr[i];
        arr[j] = temp;
    }
    public void reverse(int[] arr, int start, int end){
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        reverse(arr, 0, n-k-1); // part 1 revese
        reverse(arr, n-k, n-1); // part 2 reverse
        reverse(arr, 0, n-1); //reverse p1 and p2
    }
}