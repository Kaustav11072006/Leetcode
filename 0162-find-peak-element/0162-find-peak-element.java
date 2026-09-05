class Solution {
    public int findPeakElement(int[] nums) {
         if (nums.length==1){
            return 0;
        }
        if (nums[0]>nums[1]){
            return 0;
        }
        int s=0;
        int m=1;
        int e=2;
        while(e<nums.length){
        if((nums[s]<nums[m]) && (nums[e]<nums[m])){
            return m;}
        s++;
        m++;
        e++;
        }
        return nums.length-1;
    }
}