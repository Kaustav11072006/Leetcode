class Solution {
    public int totalNumbers(int[] digits) {
        // Frequency array for digits 0-9
        int[] count = new int[10];
        for (int d : digits) {
            count[d]++;
        }

        int distinctCount = 0;

        // Check all 3-digit even numbers from 100 to 998
        for (int num = 100; num < 1000; num += 2) {
            int d1 = num / 100;        // Hundreds place
            int d2 = (num / 10) % 10;  // Tens place
            int d3 = num % 10;         // Units place

            // Count occurrences needed for the current number
            int[] needed = new int[10];
            needed[d1]++;
            needed[d2]++;
            needed[d3]++;

            // Verify if digits array contains enough of each digit
            if (count[d1] >= needed[d1] && 
                count[d2] >= needed[d2] && 
                count[d3] >= needed[d3]) {
                distinctCount++;
            }
        }

        return distinctCount;   
    }
}