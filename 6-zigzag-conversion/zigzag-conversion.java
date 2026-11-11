class Solution {
    public String convert(String s, int numRows) {
        if(numRows>=s.length() || numRows==1)return s;

        StringBuilder [] arr = new StringBuilder[numRows];

        for(int r=0;r<numRows;r++){
            arr[r] = new StringBuilder();
        }
            int i=0;
            int n = s.length();
            while(i<n){
                for(int j=0;j<numRows && i<n;j++,i++){
                    arr[j].append(s.charAt(i));
                }
                for(int j=numRows-2;j>0 && i<n;j--,i++){
                    arr[j].append(s.charAt(i));
                }
            }
            StringBuilder ans = new StringBuilder();
            for(int k=0;k<numRows;k++){
                ans.append(arr[k]);
            }
            return ans.toString();
    }
}