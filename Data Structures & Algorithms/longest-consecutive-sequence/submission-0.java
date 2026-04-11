class Solution {
    public int longestConsecutive(int[] nums) {
        int length = 0;
        int count = 0;
        int n = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            count = 1;
            n = nums[i];

            while(true) {
                if (list.contains(n + 1)) {
                    count++;
                    n++;
                    continue;
                }
                break;
            }
            
            if (count > length) {
                length = count;
            }
        }

        return length;
    }
}
