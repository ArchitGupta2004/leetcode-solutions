class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int MAX = 2048; 
        boolean[] pairXor = new boolean[MAX];
        boolean[] result = new boolean[MAX];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                pairXor[nums[i] ^ nums[j]] = true;
            }
        }
        for (int p = 0; p < MAX; p++) {
            if (!pairXor[p]) continue;

            for (int num : nums) {
                result[p ^ num] = true;
            }
        }
        int count = 0;
        for (boolean b : result) {
            if (b) count++;
        }

        return count;
    }
}