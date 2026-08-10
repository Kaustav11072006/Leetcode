class Solution {
    public int removeElement(int[] nums, int val) {
        //int n = nums.length;
        int flag = 0;
        for ( int i : nums){
            if ( i != val) {
                nums[flag++] = i;
            }    
        }
        return flag;
    }
}