class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> rList = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    rList.add(i);
                    rList.add(j);
                }
            }
        }

        Collections.sort(rList);

        int[] rArray = new int[rList.size()];
        for (int i = 0; i < rList.size(); i++) {
            rArray[i] = rList.get(i);
        }

        return rArray;
    }
}
