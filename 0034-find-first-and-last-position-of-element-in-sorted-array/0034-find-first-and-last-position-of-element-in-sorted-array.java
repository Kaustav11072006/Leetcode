class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        ans[0] = findBound(nums, target, true);
        ans[1] = findBound(nums, target, false);
        return ans;
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int s = 0;
        int e = nums.length - 1;
        int bound = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                bound = mid;
                if (isFirst) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return bound;
    }
}