class Solution {
    public void rotate(int[] nums, int k) {
        int end = nums.length - 1;
        int temp = 0;
        for(int i = 0; i < k; i++){
            temp = nums[end];
            for(int j = end; j > 0; j--)
                nums[j] = nums[j-1];
            nums[0] = temp;
        }
    }
}