class Solution {
    public int smallestNumber(int n, int t) {
      while (true){
        int prod=1;
        int a=n;
        while(a>0){
            prod*=(a%10);
            a/=10;
        }
        if(prod %t==0){
            return n;
        }
        n++;
      }  
    }
}