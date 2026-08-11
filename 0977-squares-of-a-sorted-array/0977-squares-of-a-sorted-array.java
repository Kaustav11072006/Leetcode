class Solution {
    public int[] sortedSquares(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int p = nums.length - 1;
        int[] result = new int[nums.length]; // 1. Fixed array size

        while (s <= e) { // 2. Fixed loop condition
            int val1 = Math.abs(nums[s]);
            int val2 = Math.abs(nums[e]);

            if (val1 > val2) {
                result[p] = val1 * val1;
                s++;
            } else {
                result[p] = val2 * val2;
                e--;
            }
            p--; // 3. Decrement pointer after placing the squared value
        }

        return result;
    }
}