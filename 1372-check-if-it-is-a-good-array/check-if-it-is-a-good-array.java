class Solution {
    public boolean isGoodArray(int[] nums) {
        
        int g=0;
        for(int num:nums){
            g =gcd(g,num);
            if(g==1){
                return true;
            }
        }
        return false;
    }
    private int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
}