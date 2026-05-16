class Solution {
    public int maxArea(int[] heights) {
        /*
        TODO:
        1. two points, length * height (lower) 
        */
        int l = 0;
        int r = heights.length - 1;
        int area = 0;
        int maxArea = 0;
        while (l < r) {
            area = Math.min(heights[l], heights[r]) * (r - l);
            if (area > maxArea) {
                maxArea = area;
            }
            if (heights[l] < heights[r]) {
                l++;
            } else if (heights[l] >= heights[r]) {
                r--;
            }
        }
        return maxArea;
    }
}
