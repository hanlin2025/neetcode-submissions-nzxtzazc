class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
            TODO:
            1. brute force. each element loop other element in the array.
        */
        int[] output = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }
                product *= nums[j];
            }
            output[i] = product;
        }
        return output;
    }
}  
