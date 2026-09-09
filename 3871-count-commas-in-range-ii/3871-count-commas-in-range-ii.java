class Solution {
    public long countCommas(long n) {
        long commas = 0;
        for (long threshold = 1000L; threshold <= n; threshold *= 1000L) {
            commas += (n - threshold + 1);
            if (threshold > Long.MAX_VALUE / 1000L) {
                break;
            }
        }
        return commas;
    }
}