class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int temp = (n*(n+1))/2;

        for(int i : nums){
            temp -= i; 
        }
        return temp;
    }
}