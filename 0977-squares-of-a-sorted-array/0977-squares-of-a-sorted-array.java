class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;

        int[] arr = new int[nums.length];


        while(i <= j){
            int leftSquare = nums[i]*nums[i];
            int rightSquare = nums[j]*nums[j];

            if(leftSquare > rightSquare){
                arr[k] = leftSquare;
                i++;
            } else{
                arr[k] = rightSquare;
                j--;
            }
            k--;
        }
        return arr;
    }
}