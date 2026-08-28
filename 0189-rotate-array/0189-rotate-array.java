class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (k == 0) return;

        int count = 0; // Tracks total moved elements
        
        for (int start = 0; count < n; start++) {
            int current = start;
            int prevValue = nums[start];

            do {
                int next = (current + k) % n;
                
                // Swap the displaced value with prevValue
                int temp = nums[next];
                nums[next] = prevValue;
                prevValue = temp;
                
                current = next;
                count++;
            } while (start != current);
        }
    }
}