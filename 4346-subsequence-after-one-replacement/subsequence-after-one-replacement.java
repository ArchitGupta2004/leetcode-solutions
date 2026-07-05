class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(m>n)return false;
        int[]left= new int[m];
        int tldx=0;
        for(int i=0;i<m;i++){
            while (tldx<n && t.charAt(tldx)!=s.charAt(i)){
                tldx++;
            }
            left[i]=tldx;
            if(tldx<n)tldx++;   
        }
        if(left[m-1]<n)return true;
        int[]right= new int[m];
        tldx=n-1;
        for(int i=m-1;i>=0;i--){
            while(tldx >=0 &&t.charAt(tldx)!=s.charAt(i)){
                tldx--;
                
            }
            right[i]=tldx;
            if(tldx >=0)tldx--;
        }
        for(int i=0;i<m;i++){
            int LeftBound=(i>0)?left[i-1]:-1;
            int RightBound=(i<m-1)?right[i+1]:n;
            if(LeftBound<RightBound-1){
                return true;
            }
        }
        return false;
        }
    }
