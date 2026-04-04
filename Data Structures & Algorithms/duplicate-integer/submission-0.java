class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean output = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    output = true;
                    break;
                }
            }
            if (output) {
                break;
            }
        }

        return output;
    }
}