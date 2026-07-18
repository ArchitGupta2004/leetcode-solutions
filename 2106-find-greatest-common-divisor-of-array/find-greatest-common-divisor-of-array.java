class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int s = nums[0];
        int b = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] < s) {
                s = nums[i];
            }
            if (nums[i] > b) {
                b = nums[i];
            }
        }
        return gcd(s, b);
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}