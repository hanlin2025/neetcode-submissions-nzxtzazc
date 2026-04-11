class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int length = 1;
        int count = 1;

        /*
            1. length must < nums.length
            2. there must have a number start or end
            3. can we sort then count?
        */
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {            
            if (nums[i] == nums[i + 1]) {
                continue;
            }

            if (nums[i] + 1 == nums[i + 1]) {
                count++;
                if (count > length) {
                    length = count;
                }
                // System.out.println(count);
            } else {
                count = 1;
            }
            
            
        }

        // System.out.println(length);

        return length;
    }
}
