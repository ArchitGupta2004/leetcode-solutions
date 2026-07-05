class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange=-1;
        int sum=0;
        for(int num:nums){
            int t=num;
            int maxDigit=0;
            int minDigit=9;
            while(t>0){
                int digit=t%10;
                if(digit>maxDigit) maxDigit=digit;
                if(digit<minDigit) minDigit=digit;
                t /=10;
                
            }
            int current= maxDigit-minDigit;
            if(current>maxRange){
                maxRange=current;
                sum=num;
                
            }else if(current==maxRange){
                sum+=num;
            }
        }
        return sum;
    }
}