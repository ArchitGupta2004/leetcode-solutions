class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int a=0;
        for(int i=citations.length-1;i>=0;i--){
            if(citations[i]>=a+1){
                a++;

            }
            else{
                break;
            }
        }
        return a;
    }
}