class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        int arr[]= new int[27];
        for(int i=0;i<n;i++){
            int m =s.charAt(i)-'a';
            arr[m]++;
        }
        for(int i=0;i<n;i++){
            int m=s.charAt(i)-'a';
            if(arr[m]==1){
                return i;
            }

        } 
        return-1; 
    }
}