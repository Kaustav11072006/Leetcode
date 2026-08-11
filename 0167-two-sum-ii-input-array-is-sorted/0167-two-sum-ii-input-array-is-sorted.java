class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        int temp = 0;
        int s =1 , e = nums.length;
        while (s<e){
            temp = nums[s-1] + nums [e-1];
            if (temp==target){
                arr[0] = s;
                arr[1] = e;
                break;
            }else if(temp>target)e--;
            else s++;
        }
        return arr;
    }
}