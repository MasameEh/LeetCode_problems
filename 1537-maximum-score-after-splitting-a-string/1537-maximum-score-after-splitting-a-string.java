class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int ones = 0; 
        int zeros = 0; 
        int maxScore = 0;

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '1'){
                ones++;
            }
        }

       for(int i = 0; i < n - 1; i++) { 
            if(s.charAt(i) == '0'){
                zeros++;
            }else ones--;

            maxScore = Math.max(maxScore, zeros + ones);
        }

        return maxScore;
    }
}