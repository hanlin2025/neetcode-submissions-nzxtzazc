class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*
        TODO:
        1. if index1 == index2
        2. ? if(index1 > index2)
        3. 1 + 2 == target
        */
        int l = 0;
        int r = numbers.length - 1;
        
        while (l < r) {
            int left = numbers[l];
            int right = numbers[r];

            if (left + right == target) {
                l++;
                r++;
                break;
            } else if (left + right > target) {
                r--;
                continue;
            } else if (left + right < target) {
                l++;
                continue;
            }
        }

        int[] result = new int[2];
        result[0] = l;
        result[1] = r;

        return result;
    }
}
