class Solution {
    public int minimumAverageDifference(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        long sum = 0;
        int n = nums.length;
        for(int i=0;i<n; i++) {
            sum+= nums[i];
        }
        long rsum = 0;
        long min = Long.MAX_VALUE;
        int rindex = -1;
        for(int i=0;i<n; i++) {
            rsum+=nums[i];
            sum-=nums[i];
            long left = 0;
            long right = 0;
            if(rsum!=0) {
                left = rsum / (int)(i+1);
            }
            if(sum !=0 && n-i-1>0) {
                right = sum/(int)(n-i-1);
            }
            long diff = Math.abs(left - right);
            if(diff == 0){
                return i;
            }
            if(diff<min) {
                min = diff;
                rindex = i;  
            }
        }
        return rindex;
    }
}