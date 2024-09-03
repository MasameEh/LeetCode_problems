class Solution {
    public int getLucky(String s, int k) {
        int indexChar = 0;
        String conv = "";

        for(int i = 0; i < s.length(); i++){
            indexChar = s.charAt(i) - 'a' + 1;
            conv+=indexChar;
        }
        
        while(k > 0){
            int i = 0, sum = 0; 
            while(i < conv.length()){
                int num = conv.charAt(i) - '0';
                sum+=num;
                i++;
            }
            conv = Integer.toString(sum);  // Update conv with the new sum as a string
            k--;
        }
        
        return Integer.parseInt(conv);
    }
}