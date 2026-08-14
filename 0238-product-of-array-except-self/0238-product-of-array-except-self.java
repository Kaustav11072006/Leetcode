class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        
        int p = 1;          
        int zeroCount = 0;  
        
        for (int x : nums) {
            if (x == 0) {
                zeroCount++;
            } else {
                p *= x;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                arr[i] = 0;
            } else if (zeroCount == 1) {
                if (nums[i] == 0) {
                    arr[i] = p;
                } else {
                    arr[i] = 0;
                }
            } else {
                arr[i] = p / nums[i];
            }
        }
        
        return arr;
    }
}