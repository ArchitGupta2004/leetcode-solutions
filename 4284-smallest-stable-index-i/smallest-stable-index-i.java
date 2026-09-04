class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int min=0,max=0,f=0,i,j,l;
        for(i=0;i<nums.length;i++){
            max=nums[0];min=nums[i];
            for(j=0;j<=i;j++){
                max=Math.max(max,nums[j]);
            }
            for(l=i;l<nums.length;l++){
                min=Math.min(min,nums[l]);
            }
            if((int)(max-min) <=k){
                f=1;break;
            }
        }
        if(f==1)
            return i;
        else
            return -1;

    }
}