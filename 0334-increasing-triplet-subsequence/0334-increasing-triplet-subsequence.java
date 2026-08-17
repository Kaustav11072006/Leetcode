class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n1 = Integer.MAX_VALUE;
        int n2 = Integer.MAX_VALUE;
        //int n3 = Integer.MAX_VALUE; 
        for (int i = 0; i < nums.length; i++) {
            if (n1 >= nums[i])
                n1 = nums[i];
            else if (n2 >= nums[i])
                n2 = nums[i];
            else {
                //n3=nums[i];
                return true;
            }
        }
        return false;
    }
}