class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n:map.values()){
            if(n>=2){
                return true;
            }
        }
        return false;  
    }
}