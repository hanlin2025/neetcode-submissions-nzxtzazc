class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> rList = new ArrayList<>();
        
        int[][] indexes = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            indexes[i][0] = nums[i];
            indexes[i][1] = i;
        }

        Arrays.sort(indexes, (a,b) -> Integer.compare(a[0], b[0]));

        int left = 0;
        int right = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (left == right) {
                break;
            }
            if (indexes[left][0] + indexes[right][0] == target) {
                rList.add(indexes[left][1]);
                rList.add(indexes[right][1]);
                left++;
            } else if (indexes[left][0] + indexes[right][0] > target) {
                right--;
            } else if (indexes[left][0] + indexes[right][0] < target) {
                left++;
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
