class Solution {
    public String toLowerCase(String s) {
        String res = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c <= 90 && c >= 65){
                c+= 32;
            }
            res+=c;
        }
        return res;  
    }
}