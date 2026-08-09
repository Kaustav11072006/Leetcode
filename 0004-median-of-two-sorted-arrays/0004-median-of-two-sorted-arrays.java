class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // int n1 = nums1.length;
        // int n2 = nums2.length;
        // int[] merged = new int[n1 + n2];

        // int i = 0, j = 0, k = 0;

        // // Traverse both arrays and insert the smaller element into merged array
        // while (i < n1 && j < n2) {
        //     if (nums1[i] <= nums2[j]) {
        //         merged[k++] = nums1[i++];
        //     } else {
        //         merged[k++] = nums2[j++];
        //     }
        // }

        // // Copy remaining elements of nums1, if any
        // while (i < n1) {
        //     merged[k++] = nums1[i++];
        // }

        // // Copy remaining elements of nums2, if any
        // while (j < n2) {
        //     merged[k++] = nums2[j++];
        // }

        int[] ans = merge(nums1,nums2);

        if (ans.length % 2 == 0){
            double ans1 = (double)(ans[ans.length/2] + ans[ans.length/2-1])/2;
            return ans1;
        }
        else {
            double ans2 = (double)(ans[ans.length/2]);
            return ans2;
        }


    }
    public int[] merge(int[] arr1 , int[] arr2){
        int ans[] = new int[arr1.length+arr2.length];

        int p1=0;
        int p2 = 0;
        int p3 = 0;

        while(p1<arr1.length || p2<arr2.length){

            // int val1 = p1<arr1.length ? arr1[p1] : Integer.Max_VALUE; 
            // int val2 = p1<arr2.length ? arr2[p2] : Integer.Max_VALUE;
            int val1 = p1 < arr1.length ? arr1[p1] : Integer.MAX_VALUE;
            int val2 = p2 < arr2.length ? arr2[p2] : Integer.MAX_VALUE;

            
            if(val1<val2){
                ans[p3] = val1 ;
                p1++;
            }
            else{
                ans[p3] = val2;
                p2++;
            }

            p3++;
        }

        return ans;
    }
}