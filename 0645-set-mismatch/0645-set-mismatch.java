class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate = -1;
        int missing = -1;

        // Step 1: Find the duplicate by marking indices negative
        for (int num : nums) {
            int index = Math.abs(num) - 1;
            if (nums[index] < 0) {
                duplicate = Math.abs(num);
            } else {
                nums[index] = -nums[index];
            }
        }

        // Step 2: The index that remains positive is the missing value
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}