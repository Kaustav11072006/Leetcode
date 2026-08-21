class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i : nums){
            hm.put(i,1);
        } 
        int j = 0;
        for (int i : hm.keySet()){
            nums[j++]=i;
        }

        for (int i = hm.size(); i<nums.length; i++){
            nums[i]=Integer.MAX_VALUE;
        }

        Arrays.sort(nums);

        return hm.size();
    }
}