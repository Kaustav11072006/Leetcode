class Solution {
    public long countCommas(long n) {

        if(n<=999) return 0;
        else if(n<=999999L) return n-1000L+1;
        else if(n<=999999999L) return (999999L-1000L+1)+(2L*(n-1000000L+1));
        else if(n<=999999999999L) return (999999L-1000L+1)+(2L*(999999999L-1000000L+1))+(3L*(n-1000000000L+1));
        else if(n<=999999999999999L) return (999999L-1000L+1)+(2L*(999999999L-1000000L+1))+(3L*(999999999999L-1000000000L+1))+(4L*(n-1000000000000L+1));
        else return (999999L-1000L+1)+(2L*(999999999L-1000000L+1))+(3L*(999999999999L-1000000000L+1))+(4L*(999999999999999L-1000000000000L+1))+(5L*(n-1000000000000000L+1));
    
        // long commas = 0;
        // for (long threshold = 1000L; threshold <= n; threshold *= 1000L) {
        //     commas += (n - threshold + 1);
        //     if (threshold > Long.MAX_VALUE / 1000L) {
        //         break;
        //     }
        // }
        // return commas;
    }
}