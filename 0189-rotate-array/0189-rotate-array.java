// class Solution {
//     public void rotate(int[] nums, int k) {
//         // int n = nums.length;
//         // k = k % n;
//         // if (k == 0) return;

//         // int count = 0; // Tracks total moved elements
        
//         // for (int start = 0; count < n; start++) {
//         //     int current = start;
//         //     int prevValue = nums[start];

//         //     do {
//         //         int next = (current + k) % n;
                
//         //         // Swap the displaced value with prevValue
//         //         int temp = nums[next];
//         //         nums[next] = prevValue;
//         //         prevValue = temp;
                
//         //         current = next;
//         //         count++;
//         // //     } while (start != current);
//         // // }
//         // int n = nums.length;
//         // k = k % n;
//         // for (int i = 0; i < k; i++) {
//         //     int last = nums[n - 1];
//         //     for (int j = n - 1; j > 0; j--) {
//         //         nums[j] = nums[j - 1];
//         //     }
//         //     nums[0] = last;
//         // }
//     k%=nums.length;
//     if(k<0)
//     {
//         k+=nums.length;
//     }
//     reverse(nums,0,nums.length-1);
//     reverse(nums,0,k-1);
//     reverse(nums,k,nums.length-1);
//     }
    
//     private void reverse(int nums[] , int left , int right)
//     {
//         while(left < right)
//         {
//             int temp = nums[left];
//             nums[left] = nums[right];
//             nums[right] = temp;
//             left++;
//             right--;
//         } 
//     }
// }

class Solution{
public void rotate(int[]nums,int k){
int n=nums.length;
k%=n;
reverse(nums,0,n-1);
reverse(nums,0,k-1);
reverse(nums,k,n-1);
}
private void reverse(int[]nums,int start,int end){
while(start<end){
int temp=nums[start];
nums[start]=nums[end];
nums[end]=temp;
start++;
end--;
}
}
}