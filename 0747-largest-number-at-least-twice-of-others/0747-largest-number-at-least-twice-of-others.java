class Solution {
    public int dominantIndex(int[] nums) {
        int pos = 0, max1 = 0,max2 = 0;
        for(int i =0; i< nums.length;i++){
            if (max1 < nums[i]){
                max2=max1;
                max1=nums[i];
                pos=i;
            }
            else if (max2 < nums[i] && max2!=max1) max2=nums[i];
        }
        if (2*max2<=max1) return pos;
        else return -1;        
    }
}