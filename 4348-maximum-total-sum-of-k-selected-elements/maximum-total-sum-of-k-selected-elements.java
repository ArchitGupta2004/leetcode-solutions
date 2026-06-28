class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n=nums.length;
        long totalSum=0;
        int currentMul=mul;
        for(int i=0;i<k;i++){
            long val=nums[n-1-i];
            long opt1=val;
            long opt2=val*currentMul;
            totalSum +=Math.max(opt1,opt2);
            currentMul--;
        }
        return totalSum;
    }
}