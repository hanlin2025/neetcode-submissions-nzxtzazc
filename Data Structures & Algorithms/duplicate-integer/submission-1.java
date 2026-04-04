class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean output = false;
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                output = true;
                break;
            } else {
                set.add(n);
            }
        }

        return output;
    }
}