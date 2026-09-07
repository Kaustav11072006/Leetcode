class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int flag = 0 ,max =0;
        for(int i : nums){
            if (i==1){
                flag++;
                max = Math.max(max,flag);
            }
            else flag = 0;
        }
        return max;
    }
}