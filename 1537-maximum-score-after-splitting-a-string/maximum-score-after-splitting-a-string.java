class Solution {
    public int maxScore(String s) {
        int totalOne= 0;
        int zero= 0;
        int maxS = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                totalOne++;
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zero++; 
            } else {
                totalOne--;
            }
            maxS= Math.max(maxS, zero + totalOne);
        }
        return maxS; 
    }
}