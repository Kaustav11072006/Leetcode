class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int p = prices[0];
        for ( int i : prices){
           if (p>i) p=i;
           //p = Math.min(i,p);
            
            else{
                int n =i-p;
                max = Math.max(max,n);
            }
        }
        return max;
    }
}