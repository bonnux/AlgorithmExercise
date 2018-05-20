class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            m.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; ++i) {
            int temp = target - nums[i];
            if (m.containsKey(temp) && m.get(temp) != i) {
                res[0] = i;
                res[1] = m.get(temp);
                break;
            }
        }
        return res;
    }
} 